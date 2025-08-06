package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JButton Add,back;
    JTextField t2,t5;
    JComboBox t3,t4,t6;
    AddRoom()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,790,460);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        JLabel label=new JLabel("Add Rooms");
        label.setBounds(194,40,140,20);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
        label.setForeground(Color.WHITE);
        panel.add(label);


        JLabel label2=new JLabel("Room Number");
        label2.setBounds(100,50,152,222);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        t2=new JTextField();
        t2.setBounds(250,150,156,23);
        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);


        JLabel label3=new JLabel("Availability");
        label3.setBounds(100,90,152,222);
        label3.setFont(new Font("Tahoma",Font.BOLD,18));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        t3=new JComboBox(new String[]{"Available","Occupied"});
        t3.setBounds(250,190,156,23);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel label4=new JLabel("Cleaning Status");
        label4.setBounds(100,130,152,222);
        label4.setFont(new Font("Tahoma",Font.BOLD,18));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        t4=new JComboBox(new String[]{"Cleaned","Durty"});
        t4.setBounds(250,228,156,23);
        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel label5=new JLabel("Price");
        label5.setBounds(100,180,152,222);
        label5.setFont(new Font("Tahoma",Font.BOLD,18));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        t5=new JTextField();
        t5.setBounds(250,274,156,23);
        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);


        JLabel label6=new JLabel("Bed Type");
        label6.setBounds(100,220,152,222);
        label6.setFont(new Font("Tahoma",Font.BOLD,18));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        t6=new JComboBox(new String[]{"Single Bed","Double Bed"});
        t6.setBounds(250,315,156,23);
        t6.setFont(new Font("Tahoma",Font.PLAIN,14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);





        Add=new JButton("Add");
        Add.setBounds(100 ,370,100,30);
        Add.setBackground(Color.WHITE);
        Add.setForeground(Color.BLACK);
        Add.setFont(new Font("Tahoma",Font.BOLD,15));
        Add.addActionListener(this);
        panel.add(Add);


        back=new JButton("Back");
        back.setBounds(300 ,370,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        panel.add(back);
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image i1=imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIconl=new ImageIcon(i1);
        JLabel label7=new JLabel(imageIconl);
        label7.setBounds(450 ,140,250,250);
        panel.add(label7);


        setUndecorated(true);
        setLocation(20,90);
        setLayout(null);
        setSize(800,470);


        setVisible(true);



//        getContentPane().setBackground(new Color(3,45,48));
//        setLayout(null);
//        setSize(1950,1090);
//        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Add)
        {
            try {
                con c=new con();
                String room=t2.getText();
                String ava=(String)t3.getSelectedItem();
                String status=(String)t4.getSelectedItem();
                String price=(String)t5.getText();
                String type=(String)t6.getSelectedItem();

                String query="insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                this.setVisible(false);



            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        else {
            setVisible(false);
        }

    }

    public  static void main(String[] args)
    {
        new AddRoom();
    }
}
