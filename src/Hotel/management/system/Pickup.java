package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame implements ActionListener{

    Pickup()
    {
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,840 ,440);
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image=imageIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(620,50,100,100);
        panel.add(imglabel);

        JLabel label1=new JLabel("Pick-Up Service");
        label1.setBounds(90,11,200,35);
        label1.setFont(new Font("Tahoma ", Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2=new JLabel("Type Of Car");
        label2.setBounds(32,97,120,25);
        label2.setFont(new Font("Tahoma ", Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice c=new Choice();
        c.setBounds(190,97,150,25);
        panel.add(c);
        try
        {
            con ch=new con();
            ResultSet resultSet=ch.statement.executeQuery("select * from drivers");
            while (resultSet.next())
            {
                c.add(resultSet.getString("carname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        JTable table=new JTable();
        table.setBounds(0,170,800,100);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        JButton btnBU=new JButton("Back");
        btnBU.setBounds(500 ,370,100,27);
        btnBU.setBackground(Color.BLACK);
        btnBU.setForeground(Color.WHITE);
        panel.add(btnBU);
        btnBU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JButton btnd=new JButton("Display");
        btnd.setBounds(240,370,130,25);
        btnd.setBackground(Color.BLACK);
        btnd.setForeground(Color.WHITE);
        panel.add(btnd);
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q="select * from drivers where carname ='"+c.getSelectedItem()+"'";
                try{
                    con c=new con();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        try
        {
            con cons=new con();
            String q="select * from drivers ";
            ResultSet resultSet=cons.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
//


        } catch (Exception e) {
           e.printStackTrace();
        }


        JLabel label3=new JLabel("Name");
        label3.setBounds(3,150,130,25);
        label3.setFont(new Font("Tahoma ", Font.BOLD,17));
        label3.setForeground(Color.WHITE);
        panel.add(label3);


                JLabel label4=new JLabel("Age");
        label4.setBounds(120,150,130,25);
        label4.setFont(new Font("Tahoma ", Font.BOLD,17));
        label4.setForeground(Color.WHITE);
        panel.add(label4);


        JLabel label5=new JLabel("Gender");
        label5.setBounds(240,150,130,25);
        label5.setFont(new Font("Tahoma ", Font.BOLD,17));
        label5.setForeground(Color.WHITE);
        panel.add(label5);




        JLabel label7=new JLabel("CarCompany");
        label7.setBounds(340,150,130,25);
        label7.setFont(new Font("Tahoma ", Font.BOLD,17));
        label7.setForeground(Color.WHITE);
        panel.add(label7);

        JLabel label6=new JLabel("Carname");
        label6.setBounds(470,150,130,25);
        label6.setFont(new Font("Tahoma ", Font.BOLD,17));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JLabel label8=new JLabel("Avalible");
        label8.setBounds(570,150,130,25);
        label8.setFont(new Font("Tahoma ", Font.BOLD,17));
        label8.setForeground(Color.WHITE);
        panel.add(label8);

        JLabel label9=new JLabel("Location");
        label9.setBounds(690,150,130,25);
        label9.setFont(new Font("Tahoma ", Font.BOLD,17));
        label9.setForeground(Color.WHITE);
        panel.add(label9);

        setUndecorated(true);
        setLayout(null);
        setSize(850 ,450);
        setLocation(340,90);
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public  static void main(String[] args)
    {

        new Pickup();
    }
}
