package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class customer_info extends JFrame implements ActionListener {
    JTable table;
    JButton Add,Back;
    customer_info()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        table=new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try
        {
            con c=new con();
            String q="select * from newcustmer";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));



        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel label=new JLabel("ID");
        label.setBounds(31,11,46,14);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);


        JLabel label1=new JLabel("Number");
        label1.setBounds(150,11,100,14);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

//        JLabel label2=new JLabel("ID");
//        label2.setBounds(31,11,46,14);
//        label2.setForeground(Color.WHITE);
//        label2.setFont(new Font("Tahoma",Font.BOLD,14));
//        panel.add(label2);

        JLabel label3=new JLabel("Name");
        label3.setBounds(270,11,100,14);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4=new JLabel("Gender");
        label4.setBounds(360,11,100,14);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);


        JLabel label5=new JLabel("Country");
        label5.setBounds(480,11,100,14);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6=new JLabel("Room");
        label6.setBounds(600,11,100,14);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);
        JLabel label8=new JLabel("CI Time");
        label8.setBounds(680,11,100,14);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label8);


        JLabel label7=new JLabel("Deposit");
        label7.setBounds(800,11,100,14);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);







//        Add=new JButton("Search");
//        Add.setBounds(200 ,510,100,30);
//        Add.setBackground(Color.WHITE);
//        Add.setForeground(Color.BLACK);
//        Add.setFont(new Font("Tahoma",Font.BOLD,15));
//        Add.addActionListener(this);
//        panel.add(Add);


        Back=new JButton("Back");
        Back.setBounds(450 ,510,120,30);
        Back.setBackground(Color.WHITE);
        Back.setForeground(Color.BLACK);
        Back.setFont(new Font("Tahoma",Font.BOLD,15));
        Back.addActionListener(this);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);


            }
        });



        setLayout(null);
        setUndecorated(true);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new customer_info();

    }
}
