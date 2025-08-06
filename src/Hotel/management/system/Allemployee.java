package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Allemployee extends JFrame {
    Allemployee()
    {
        JPanel panel =new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,760,490);
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);
        JLabel label1 =new JLabel("Name");
        label1.setBounds(5,14,105,20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label1);

        JLabel label2 =new JLabel("Age");
        label2.setBounds(100,14,105,18);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label2);

        JLabel label3 =new JLabel("Gender");
        label3.setBounds(180,14,105,20);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label3);

        JLabel label4 =new JLabel("Job");
        label4.setBounds(280,14,105,18);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label4);

        JLabel label5 =new JLabel("Salary");
        label5.setBounds(350,14,105,20);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label5);

        JLabel label6 =new JLabel("Phone");
        label6.setBounds(450,14,105,18);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label6);

        JLabel label7 =new JLabel("Aadhar Card");
        label7.setBounds(550,14,105,20);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label7);

        JLabel label8 =new JLabel("Email Id");
        label8.setBounds(630,14,105,18);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahona",Font.BOLD,14));
        panel.add(label8);


        try
        {
            con c=new con();
            String departmentInfo="select *from employ;";
            ResultSet resultSet=c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }
        JButton back=new JButton("Back");
        back.setBounds(400,410,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setLocation(430,120);
        setSize(770,500);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new Allemployee();
    }

}
