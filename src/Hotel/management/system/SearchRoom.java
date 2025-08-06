package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    JButton Add,Back;
    JCheckBox checkBox1;
    Choice choice;
    JTable table;

    SearchRoom()
    {

        JPanel panel=new JPanel();
        panel.setBounds(5,5,840 ,440);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JLabel label=new JLabel("SEARCH FOR ROOM ");
        label.setBounds(250,11,250,31);
        label.setFont(new Font("Tahoma ", Font.BOLD,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

        checkBox1=new JCheckBox("Only Display Available ");
        checkBox1.setBounds(400,69,205,23);
        checkBox1.setForeground(Color.WHITE);
        checkBox1.setBackground(new Color(3,45,48));
        panel.add(checkBox1);

        choice =new Choice();
        choice.add("single bed");
        choice.add("double bed");
        choice.setBounds(153,69,120,20);
        panel.add(choice);
        JLabel label2=new JLabel("Room Number");
        label2.setBounds(3,150,152,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3=new JLabel("Availability");
        label3.setBounds(140,150,152,20);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4=new JLabel("Cleaning Status");
        label4.setBounds(285,150,152,20);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);


        JLabel label5=new JLabel("Price");
        label5.setBounds(450,150,152,20);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);


        JLabel label6=new JLabel("Bed Type");
        label6.setBounds(570,150,152,20);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        Add=new JButton("Search");
        Add.setBounds(270,400,100,30);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setFont(new Font("Tahoma",Font.BOLD,15));
        Add.addActionListener(this);
        panel.add(Add);
        Back=new JButton("Back");
        Back.setBounds(570,400,100,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setFont(new Font("Tahoma",Font.BOLD,15));
        Back.addActionListener(this);
        panel.add(Back);



        table=new JTable();
        table.setBounds(0,187,700,250);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try
        {
            con con=new con();
            String q="select *from room";
            ResultSet resultSet= con.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        } catch (Exception e) {
            e.printStackTrace();
        }



        setUndecorated(true);
        setLayout(null);

        setSize(850 ,450);
        setLocation(340,90);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Add)
        {
            String Q="select *from Room where bedtype='"+choice.getSelectedItem()+"' ";
            String Q1="select *from Room where availability ='Available' And bedtype ='"+choice.getSelectedItem()+"' ";
            try{
                con c=new con();
                ResultSet resultSet=c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
                if (checkBox1.isSelected())
                {
                    ResultSet resultSet1=c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }

    }

    public static void  main(String[] args)
    {
        new SearchRoom();
    }


}
