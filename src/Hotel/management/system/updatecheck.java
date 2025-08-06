package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updatecheck extends JFrame implements ActionListener {
    updatecheck()

    {
        JTextField textField1,textField2,textField3,textField4,textField5;
        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel label=new JLabel("Check-In Details ");
        label.setBounds(118,11,260,53);
        label.setFont(new Font("Tahoma ", Font.BOLD,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel label1=new JLabel("ID Number:");
        label1.setBounds(35,65,150,20);
        label1.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label1.setForeground(Color.WHITE);
        panel.add(label1);


        Choice c=new Choice();
        c.setBounds(271,65,200,23);
        panel.add(c);
        try
        {
            con ch=new con();
            ResultSet resultSet=ch.statement.executeQuery("select *from newcustmer;");
            while (resultSet.next())
            {
                c.add(resultSet.getString("numbers"));
            }
        } catch (Exception e) {
            e.printStackTrace();

}

        JLabel label2=new JLabel(" Room Number :");
        label2.setBounds(35,111,200,20);
        label2.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        textField1=new JTextField();
        textField1.setBounds(271,111,200,23);
        textField1.setFont(new Font("Tahoma ", Font.BOLD,14));
        textField1.setForeground(Color.WHITE);
        textField1.setBackground(new Color(16,108,115));
        panel.add(textField1);




        JLabel label3=new JLabel("Name:");
        label3.setBounds(35,160,200,20);
        label3.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        textField2=new JTextField();
        textField2.setBounds(271,160,200,23);
        textField2.setFont(new Font("Tahoma ", Font.BOLD,15));
        textField2.setBackground(new Color(16,108,115));
        textField2.setForeground(Color.WHITE);
        panel.add(textField2);


        JLabel label4=new JLabel("Checked-In :");
        label4.setBounds(35,220,200,20);
        label4.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        textField3=new JTextField();
        textField3.setBounds(271,220,200,23);
        textField3.setFont(new Font("Tahoma ", Font.BOLD,15));
        textField3.setBackground(new Color(16,108,115));
        textField3.setForeground(Color.WHITE);
        panel.add(textField3);



        JLabel label5=new JLabel("Amount Paid (Rs) :");
        label5.setBounds(35,280,200,20);
        label5.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        textField4=new JTextField();
        textField4.setBounds(271,280,200,23);
        textField4.setFont(new Font("Tahoma ", Font.BOLD,15));
        textField4.setBackground(new Color(16,108,115));
        textField4.setForeground(Color.WHITE);
        panel.add(textField4);

        JLabel label6=new JLabel("Panding Amount (Rs) :");
        label6.setBounds(35,350,200,20);
        label6.setFont(new Font("Tahoma ", Font.PLAIN,18));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        textField5=new JTextField();
        textField5.setBounds(271,350,200,23);
        textField5.setFont(new Font("Tahoma ", Font.BOLD,15));
        textField5.setBackground(new Color(16,108,115));
        textField5.setForeground(Color.WHITE);
        panel.add(textField5);



        JButton btnd=new JButton("Update");
        btnd.setBounds(56,420,89,23);
        btnd.setBackground(Color.BLACK);
        btnd.setForeground(Color.WHITE);
        panel.add(btnd);
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    con co= new con();
                    String q=c.getSelectedItem();
                     String room=textField1.getText();
                     String name=textField2.getText();
                     String check=textField3.getText();
                     String  amount=textField4.getText();
                    co.statement.executeUpdate("update newcustmer set room_no='"+room+"',names='"+name+"',check_in='"+check+"',deposit='"+amount+"' where numbers='"+q+"'");
                    JOptionPane.showMessageDialog(null,"update succesfully");
                    setVisible(false);




                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });




        JButton btnBU=new JButton("Back");
        btnBU.setBounds(168,420,89,23);
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
        check.setBounds(281,420,89,23);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setFont(new Font("Tahoma",Font.BOLD,15));
        check.addActionListener(this);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id=c.getSelectedItem();
                String q="select *from newcustmer where numbers= '"+id+"'";
                try {
                    con c= new con();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    while(resultSet.next())
                    {
                        textField1.setText(resultSet.getString("room_no"));
                        textField2.setText(resultSet.getString("names"));

                        textField3.setText(resultSet.getString("check_in"));
                        textField4.setText(resultSet.getString("Deposit"));


                    }
                    ResultSet resultSet1=c.statement.executeQuery("select *from room where roomnumber ='"+textField1.getText()+"'");
                    while(resultSet1.next())
                    {
                        String price=resultSet1.getString("price");
                        int amountpaid=Integer.parseInt(price)- Integer.parseInt(textField4.getText());
                        textField5.setText(""+amountpaid);

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });



        setUndecorated(true);
        setLayout(null);
        setLocation(340,90);
        setSize(850 ,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args)
        {
            new updatecheck();
        }

}
