package Hotel.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table1;
    JButton back;

    Room()
    {


        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,440);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label= new JLabel(imageIcon1);
        label.setBounds(620,85,200,200);
        panel.add(label);






        table1=new JTable();
        table1.setBounds(10,100,500,200);
        table1.setBackground(new Color(3,45,48) );
        table1.setForeground(Color.WHITE);
        panel.add(table1);
        try{
            con c=new con();
            String RoomInfo="select * from room";
            ResultSet resultSet=c.statement.executeQuery(RoomInfo);
            table1.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel roominfo =new JLabel("Room-Status");
        roominfo.setBounds(210,20,150,30);
        roominfo.setForeground(Color.WHITE);
        roominfo.setFont(new Font( "Tahoma",Font.BOLD,20));
        panel.add(roominfo);


        JLabel room =new JLabel("Room No.");
        room.setBounds(30,60,80,19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font( "Tahoma",Font.BOLD,14));
        panel.add(room);


        JLabel availability =new JLabel("Availability");
       availability.setBounds(119,60,80,19);
       availability.setForeground(Color.WHITE);
       availability.setFont(new Font( "Tahoma",Font.BOLD,14));
       panel.add(availability);


        JLabel clean =new JLabel("Clean Status");
       clean.setBounds(216,60,150,19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font( "Tahoma",Font.BOLD,14));
        panel.add(clean);


        JLabel price =new JLabel("Price");
        price.setBounds(330,60,80,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font( "Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel bedtype =new JLabel("Bed Type");
        bedtype.setBounds(417,60,150,19);
        bedtype.setForeground(Color.WHITE);
        bedtype.setFont(new Font( "Tahoma",Font.BOLD,14));
        panel.add(bedtype);
//
//
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(417,400,100,27);
        panel.add(back);



        setUndecorated(true);
        setLayout(null);
        setSize(850 ,450);
        setLocation(340,90);
        setVisible(true);



    }
    public  static  void main(String[] args)
    {
        new Room();

    }
}
