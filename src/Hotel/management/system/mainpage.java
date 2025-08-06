package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainpage extends JFrame implements ActionListener
{
    mainpage()
    {
        ImageIcon imageIcon6=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i6=imageIcon6.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIconlogin1=new ImageIcon(i6);
        JLabel label6=new JLabel(imageIconlogin1);
        label6.setBounds(20,5,300,300);
        add(label6);


        JLabel label=new JLabel("Welcome To");
        label.setBounds(420,40,500,90);
        label.setFont(new Font("Tahoma ", Font.BOLD,50));
        label.setForeground(Color.pink);
        add(label);

        JLabel label1=new JLabel("Luxury & Delex Hotel");
        label1.setBounds(340,140,800,90);
        label1.setFont(new Font("Tahoma ", Font.BOLD,50));
        label1.setForeground(Color.pink);
        add(label1);



//        ImageIcon imageIconr=new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
//        Image i4=imageIconr.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
//        ImageIcon imageIcon4=new ImageIcon(i4);
//        JLabel label2=new JLabel(imageIcon4);
//        label2.setBounds(200,40,500,500);
//        add(label2);
//



        ImageIcon imageIcon5=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i5=imageIcon5.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIconlogin=new ImageIcon(i5);
        JLabel label4=new JLabel(imageIconlogin);
        label4.setBounds(900,5,300,300);
        add(label4);

        ImageIcon imageIcon3=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i3=imageIcon3.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon imageIconlc=new ImageIcon(i3);
        JLabel label3=new JLabel(imageIconlc);
        label3.setBounds(420 ,210,350,350);
        add(label3);


        JButton btnd=new JButton("Login");
        btnd.setBounds(460,590,90,23);
        btnd.setBackground(Color.WHITE);
        btnd.setFont(new Font("Tahoma",Font.BOLD,16));
        btnd.setForeground(Color.BLACK);
       add(btnd);
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    new login();

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });

        JButton btnd2=new JButton("Admin Login");
        btnd2.setBounds(570,590,140,23);
        btnd2.setBackground(Color.WHITE);
        btnd2.setFont(new Font("Tahoma",Font.BOLD,16));
        btnd2.setForeground(Color.BLACK);
        add(btnd2);
        btnd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    new login2();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });





        getContentPane().setBackground(new Color(3, 45, 48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args)
    {
        new mainpage();

    }
}
