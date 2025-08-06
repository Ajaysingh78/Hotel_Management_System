package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.util.EventObject;
import java.awt.event.ActionListener;

public class login  extends JFrame implements ActionListener {
    JTextField  textField1,textField2;
    JPasswordField passwordField1;
    JButton button1,button2;
    login()
    {
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i4 = imageIcon4.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIconlogin = new ImageIcon(i4);
        JLabel label4 = new JLabel(imageIconlogin);
        label4.setBounds(800, 100, 300, 300);
        add(label4);

        JLabel label1=new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);
        textField1=new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
      add(textField1);


        JLabel label2=new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);
        passwordField1 =new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(26,104,110));
      add(passwordField1);
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(318,-30,255,300);
        Image i1=imageIcon.getImage().getScaledInstance(255, 300,Image.SCALE_DEFAULT);
       add(label);

        button1=new JButton("login");
        button1.setBounds(40,140,120,30);
        button1.setFont(new Font("sarif",Font.BOLD,15));
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        button1.setForeground(Color.WHITE);
       add(button1);

        button2=new JButton("Cancel");
        button2.setBounds(180,140,120,30);
        button2.setFont(new Font("sarif",Font.BOLD,15));
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        button2.setForeground(Color.WHITE);

        add(button2);




        getContentPane().setBackground( new Color(3,45,48));
       setLayout(null);
       setUndecorated(true);
        setLocation(400,270);
      setSize(600 ,300);
      setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button1)
        {
            try{
                con c= new con();
                String user=textField1.getText();
                String pass=passwordField1.getText();
                String query="select * from login where username= '"+user+"' and password='"+pass+"'";
                ResultSet resultSet=c.statement.executeQuery(query);
                if(resultSet.next())
                {
                   new Dashbord();


                }
                else {
                    JOptionPane.showMessageDialog(null,"Invaild");

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else {
           System.exit(102);
        }

    }


    public  static  void main(String[]args)
    {
        new login();

    }
}
