package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton addemploye,addroom,adddriver,logout,back;

    Admin()
    {
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1=imageIcon.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon imageIconl=new ImageIcon(i1);
        JLabel label=new JLabel(imageIconl);
        label.setBounds(100 ,100,100,100);
        add(label);
        addemploye=new JButton("Add Employee");
        addemploye.setBounds(250 ,137,200,30);
        addemploye.setBackground(Color.WHITE);
        addemploye.setForeground(Color.BLACK);
        addemploye.setFont(new Font("Tahoma",Font.BOLD,15));
        addemploye.addActionListener(this);
        add(addemploye);





        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i2=imageIcon2.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imageIconlr=new ImageIcon(i2);
        JLabel label2=new JLabel(imageIconlr);
        label2.setBounds(100 ,220,100,100);
        add(label2);

        addroom=new JButton("Add Room");
        addroom.setBounds(250 ,260,200,30);
        addroom.setBackground(Color.WHITE);
        addroom.setForeground(Color.BLACK);
        addroom.setFont(new Font("Tahoma",Font.BOLD,15));
        addroom.addActionListener(this);
        add(addroom);


        ImageIcon imageIcon3=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image i3=imageIcon3.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imageIconlc=new ImageIcon(i3);
        JLabel label3=new JLabel(imageIconlc);
        label3.setBounds(100 ,350,100,100);
        add(label3);
        adddriver=new JButton("Add Driver");
        adddriver.setBounds(250 ,380,200,30);
        adddriver.setBackground(Color.WHITE);
        adddriver.setForeground(Color.BLACK);
        adddriver.setFont(new Font("Tahoma",Font.BOLD,15));
        adddriver.addActionListener(this);
        add(adddriver);


       logout=new JButton("Log out");
        logout.setBounds(170 ,570,100,30);
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

       back=new JButton("Back");
        back.setBounds(400 ,570,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);
        ImageIcon imageIcon4=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i4=imageIcon4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIconlogin=new ImageIcon(i4);
        JLabel label4=new JLabel(imageIconlogin);
        label4.setBounds(800,100,300,300);
       add(label4);




        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addemploye)
        {
            new AddEmployee2();

        } else if (e.getSource()==adddriver) {
            new Adddrivers();

        } else if (e.getSource()==addroom) {
            new AddRoom();

        } else if (e.getSource()==logout) {
            System.exit(102);

        }
        else {
            new Dashbord();
            this.setVisible(false);

        }

    }

    public  static void main(String[] args)
    {
        new Admin();

    }

}
