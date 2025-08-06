package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adddrivers extends JFrame implements ActionListener {
    JButton BACK ,SAVE,LOGOUT,Back;
        JTextField t2,t3,t6,t8,t5,t9;
        JComboBox t4,t7;
        JRadioButton r1,r2;
    Adddrivers()
    {


            JPanel panel =new JPanel();
            panel.setBounds(5,5,790,460);
            panel.setLayout(null);
            panel.setBackground(new Color(3,45,48));
            add(panel);


            JLabel label=new JLabel("ADD DRIVERS");
            label.setBounds(550,50,300,22);
            label.setFont(new Font("Tahoma",Font.BOLD,22));
            label.setForeground(Color.WHITE);
            panel.add(label);

            JLabel name= new JLabel("NAME");
            name.setBounds(60,30,150,27);
            name.setFont(new Font("serif",Font.BOLD,17));
            name.setForeground(Color.WHITE);
            panel.add(name);
            t2=new JTextField();
            t2.setBounds(200,30,150,27);
            t2.setBackground(new Color(16,108,115));
            t2.setFont(new Font("Tahoma ",Font.BOLD,14));
            panel.add(t2);


            JLabel age= new JLabel("AGE");
            age.setBounds(60,80,150,27);
            age.setFont(new Font("serif",Font.BOLD,17));
            age.setForeground(Color.WHITE);
            panel.add(age);
            t3=new JTextField();
            t3.setBounds(200,80,150,27);
            t3.setBackground(new Color(16,108,115));
            t3.setFont(new Font("Tahoma ",Font.BOLD,14));
            panel.add(t3);



            JLabel label3=new JLabel("GENDER");
            label3.setBounds(60,120,150,27);
            label3.setFont(new Font("serif",Font.BOLD,17));
            label3.setForeground(Color.WHITE);
            panel.add(label3);

            r1=new JRadioButton("MALE");
            r1.setBackground(new Color(3,45,48));
            r1.setBounds(200,120,70,27);
            r1.setForeground(Color.WHITE);
            panel.add(r1);
            r2=new JRadioButton("FEMALE");
            r2.setBackground(new Color(3,45,48));
            r2.setBounds(280,120,90,27);
            r2.setForeground(Color.WHITE);
            panel.add(r2);






            JLabel label4=new JLabel("Car Company");
            label4.setBounds(60,170,150,27);
            label4.setFont(new Font("serif",Font.BOLD,17));
            label4.setForeground(Color.WHITE);
            panel.add(label4);
            t5=new JTextField();
            t5.setBounds(200,170,150,30);
            t5.setFont(new Font("Tahoma",Font.PLAIN,14));
            t5.setForeground(Color.WHITE);
            t5.setBackground(new Color(16,108,115));
            panel.add(t5);


            JLabel label5=new JLabel("Car name");
            label5.setBounds(60,220,150,27);
            label5.setFont(new Font("serif",Font.BOLD,17));
            label5.setForeground(Color.WHITE);
            panel.add(label5);
            t6=new JTextField();
            t6.setBounds(200,220,150,30);
            t6.setFont(new Font("Tahoma",Font.PLAIN,14));
            t6.setForeground(Color.WHITE);
            t6.setBackground(new Color(16,108,115));
            panel.add(t6);



            JLabel label6=new JLabel("Availblity");
            label6.setBounds(60,270,150,27);
            label6.setFont(new Font("serif",Font.BOLD,17));
            label6.setForeground(Color.WHITE);
            panel.add(label6);
            t7=new JComboBox(new String[]{"Yes"," No"});
            t7.setBounds(200,270,150,30);
            t7.setFont(new Font("Tahoma",Font.PLAIN,14));
            t7.setForeground(Color.WHITE);
            t7.setBackground(new Color(16,108,115));
            panel.add(t7);

            JLabel label9=new JLabel("Location");
            label9.setBounds(60,320,150,27);
            label9.setFont(new Font("serif",Font.BOLD,17));
            label9.setForeground(Color.WHITE);
            panel.add(label9);
            t8=new JTextField();
            t8.setBounds(200,320,150,30);
            t8.setFont(new Font("Tahoma",Font.PLAIN,14));
            t8.setForeground(Color.WHITE);
            t8.setBackground(new Color(16,108,115));
            panel.add(t8);

            ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
            Image i1=imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
            ImageIcon imageIconl=new ImageIcon(i1);
            JLabel label7=new JLabel(imageIconl);
            label7.setBounds(510 ,140,250,250);
            panel.add(label7);



            BACK=new JButton("BACK");
            BACK.setBounds(300 ,420,100,27);
            BACK.setBackground(Color.WHITE);
            BACK.setForeground(Color.BLACK);
            BACK.setFont(new Font("Tahoma",Font.BOLD,15));
            BACK.addActionListener(this);
            panel.add(BACK);


            SAVE=new JButton("SAVE");
            SAVE.setBounds(60,420,100,27);
            SAVE.setBackground(Color.WHITE);
            SAVE.setForeground(Color.BLACK);
            SAVE.setFont(new Font("Tahoma",Font.BOLD,15));
            SAVE.addActionListener(this);
            panel.add(SAVE);





            setUndecorated(true);
            setLayout(null);
            setSize(800,470);
            setLocation(20,90);
            setVisible(true);

//            getContentPane().setBackground(new Color(3,45,48));
//            setLayout(null);
//            setSize(1950,1090);
//            setVisible(true);









    }
@Override
public void actionPerformed(ActionEvent e) {
        if (e.getSource()==SAVE)
        {
                String nam=t2.getText();
                String age=t3.getText();


                String carcomapany=t5.getText();
                String carname=t6.getText();
                String availble=(String)t7.getSelectedItem();
                String location=t8.getText();
                String gender=null;
                if (r1.isSelected())
                {
                        gender="male";
                }
                else {
                        gender="female";
                }

                try {
                        con c=new con();

                        String query="insert into drivers values ('"+nam+"','"+age+"','"+gender+"','"+carcomapany+"','"+carname+"','"+availble+"','"+location+"')";
                        c.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Data Successfully Added");
                        this.setVisible(false);
                } catch (Exception ex) {
                        ex.printStackTrace();
                }

        }
        else {
                setVisible(false);
        }


}

    public static void main(String[] args)
    {
        new Adddrivers();
    }

}
