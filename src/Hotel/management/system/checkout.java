package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class checkout extends JFrame {
    checkout()
    {
        JTextField textField1,textField2,textField3,textField4;
        JPanel panel=new JPanel();
        panel.setBounds(5,5,840 ,510);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel label=new JLabel("Check-Out");
        label.setBounds(118,11,260,53);
        label.setFont(new Font("Tahoma ", Font.BOLD,24));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel label1=new JLabel(" Customer Id :");
        label1.setBounds(35,80,100,20);
        label1.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        Choice Customer= new Choice();
        Customer.setBounds(200,80,150,30);
        panel.add(Customer);



        JLabel label2=new JLabel(" Room Number : ");
        label2.setBounds(35,128,200,20);
        label2.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);


        JLabel labeltext2=new JLabel(" ");
        labeltext2.setBounds(200,125,200,20);
        labeltext2.setFont(new Font("Tahoma ", Font.PLAIN,14));
        labeltext2.setForeground(Color.WHITE);
        panel.add(labeltext2);

//        textField1=new JTextField();
//        textField1.setBounds(200,125,200,23);
//        textField1.setFont(new Font("Tahoma ", Font.BOLD,14));
//        textField1.setForeground(Color.WHITE);
//        textField1.setBackground(new Color(16,108,115));
//        panel.add(textField1);

        JLabel label3=new JLabel("Check-In Time:");
        label3.setBounds(35,180,200,20);
        label3.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel labeltext3=new JLabel(" ");
        labeltext3.setBounds(200,180,200,20);
        labeltext3.setFont(new Font("Tahoma ", Font.PLAIN,14));
        labeltext3.setForeground(Color.WHITE);
        panel.add(labeltext3);

//        Date date1= new Date();
//        JLabel label5=new JLabel(""+date1);
//        label5.setBounds(200,180,200,20);
//        label5.setFont(new Font("Tahoma ", Font.PLAIN,14));
//        label5.setForeground(Color.WHITE);
//        panel.add(label5);


        JLabel label4=new JLabel("Check-Out Time:");
        label4.setBounds(35,230,200,20);
        label4.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        Date date= new Date();
        JLabel label6=new JLabel(""+date);
        label6.setBounds(200,230,200,20);
        label6.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);


        try{
            con c=new con();
            ResultSet resultSet=c.statement.executeQuery("select *from newcustmer");
            while (resultSet.next())
            {
                Customer.add(resultSet.getString("numbers"));



            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        JButton btnd=new JButton("Check-Out");
        btnd.setBounds(158,350,150,23);
        btnd.setBackground(Color.BLACK);
        btnd.setForeground(Color.WHITE);
        panel.add(btnd);
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    con co= new con();



                    co.statement.executeUpdate("delete from newcustmer where numbers='"+Customer.getSelectedItem()+"'");
                    co.statement.executeUpdate("update room set availblity ='Available' where roomnumber='"+label2.getText()+"'");

                    JOptionPane.showMessageDialog(null,"Check-out succesfully");
                    setVisible(false);




                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });




        JButton btnBU=new JButton("Back");
        btnBU.setBounds(56,390,89,23);
        btnBU.setBackground(Color.BLACK);
        btnBU.setForeground(Color.WHITE);
        panel.add(btnBU);
        btnBU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        JButton check=new JButton("Check");
        check.setBounds(286,390,89,23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setFont(new Font("Tahoma",Font.PLAIN,15));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con c=new con();
                try {
                    ResultSet resultSet=c.statement.executeQuery("select *from newcustmer where numbers='"+Customer.getSelectedItem()+"'");
                    while(resultSet.next())
                    {
                        labeltext2.setText(resultSet.getString("room_no"));
                        labeltext3.setText(resultSet.getString("check_in"));

                    }


                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });








        setUndecorated(true);
        setLayout(null);
        setLocation(340,120);
        setSize(850 ,520);
        setVisible(true);



    }
    public static void main(String[] args)
    {
        new checkout();
    }

}
