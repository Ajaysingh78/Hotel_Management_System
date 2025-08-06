package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckIn extends JFrame implements ActionListener {
    JRadioButton r1,r2;
    JComboBox t3,t4;
    JButton Add,back;
    JLabel date;
    JTextField textField1,textField2,textField3,textField4;
    Choice c1;
    CheckIn()
    {
        JPanel panel=new JPanel();
      panel.setBounds(5,5,840,540);
      panel.setLayout(null);
      panel.setBackground(new Color(3,45,48));
      add(panel);


      ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
      Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
      ImageIcon imageIcon1=new ImageIcon(image);
      JLabel imglabel=new JLabel(imageIcon1);
      imglabel.setBounds(550,150,200,200);
      panel.add(imglabel);

      JLabel label=new JLabel("NEW CUSTOMER  FORM ");
      label.setBounds(118,11,260,53);
        label.setFont(new Font("Tahoma ", Font.BOLD,20));
        label.setForeground(Color.WHITE);
        panel.add(label);

      JLabel label1=new JLabel("ID :");
      label1.setBounds(35,76,200,20);
      label1.setFont(new Font("Tahoma ", Font.BOLD,14));
      label1.setForeground(Color.WHITE);
      panel.add(label1);

        t3=new JComboBox(new String[]{"Aadhar Card","PassPort","PanCard","Voter ID","Driving License"});
        t3.setBounds(271,73,150,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(3,45,48));
        panel.add(t3);



        JLabel label2=new JLabel(" Id Number :");
        label2.setBounds(35,111,200,20);
        label2.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        textField1=new JTextField();
        textField1.setBounds(271,111,200,23);
        textField1.setFont(new Font("Tahoma ", Font.BOLD,14));
        textField1.setForeground(Color.WHITE);
      textField1.setBackground(new Color(16,108,115));
        panel.add(textField1);




        JLabel label3=new JLabel("Name :");
        label3.setBounds(35,151,200,20);
        label3.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        textField2=new JTextField();
        textField2.setBounds(271,151,200,23);
        textField2.setFont(new Font("Tahoma ", Font.BOLD,14));
      textField2.setBackground(new Color(16,108,115));
        textField2.setForeground(Color.WHITE);
        panel.add(textField2);


        JLabel label4=new JLabel("Gender :");
        label4.setBounds(35,191,200,20);
        label4.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        r1=new JRadioButton("MALE");
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,70,27);
        r1.setForeground(Color.WHITE);
        panel.add(r1);

        r2=new JRadioButton("FEMALE");
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,90,27);
        r2.setForeground(Color.WHITE);
        panel.add(r2);



        JLabel label5=new JLabel(" Country :");
        label5.setBounds(35,231,200,20);
        label5.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);


        textField3=new JTextField();
        textField3.setBounds(271,231,156,23);
        textField3.setFont(new Font("Tahoma",Font.BOLD,14));
        textField3.setForeground(Color.WHITE);
        textField3.setBackground(new Color(16,108,115));
        panel.add(textField3);


        JLabel label6=new JLabel("Allocated Room Number:");
        label6.setBounds(35,274,200,20);
        label6.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);
        c1=new Choice();
        try
        {
            con c= new con();
            ResultSet resultSet=c.statement.executeQuery("select *from room");
            while (resultSet.next())
            {
                c1.add(resultSet.getString("roomnumber"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);





        JLabel label7=new JLabel(" Checked-In :");
        label7.setBounds(35,316,200,20);
        label7.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label7.setForeground(Color.WHITE);
        panel.add(label7);



        Date date1=new Date();

        date=new JLabel(""+date1);
        date.setBounds(271,316,200,20);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma ", Font.BOLD,16));
        panel.add(date);




        JLabel label8=new JLabel(" Deposit :");
        label8.setBounds(35,359,200,20);
        label8.setFont(new Font("Tahoma ", Font.PLAIN,14));
        label8.setForeground(Color.WHITE);
        panel.add(label8);

        textField4=new JTextField();
        textField4.setBounds(271,359,200,23);
        textField4.setFont(new Font("Tahoma",Font.BOLD,14));
        textField4.setForeground(Color.WHITE);
        textField4.setBackground(new Color(16,108,115));
        panel.add(textField4);


        Add=new JButton("Add");
        Add.setBounds(100 ,450,100,30);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setFont(new Font("Tahoma",Font.BOLD,15));
        Add.addActionListener(this);
        panel.add(Add);


        back=new JButton("Back");
        back.setBounds(300 ,450,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        panel.add(back);








       setUndecorated(true);
        setLayout(null);
      setLocation(340,90);

        setSize(850 ,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource()==Add)
      {



        try{
          con con=new con();
          String id=(String)t3.getSelectedItem();
          String number=(String)textField1.getText();
          String name=(String)textField2.getText();
          String radiobtn= null;
          if (r1.isSelected())
          {
            radiobtn="Male";
          }
          else
          {
            radiobtn="Female";
          }
          String gender=radiobtn;
          String country=(String)textField3.getText();
          String room_no=c1.getSelectedItem();
          String check_in=date.getText();
          String deposit=(String)textField4.getText();
          String query1="insert into newcustmer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+room_no+"','"+check_in+"','"+deposit+"')";
          String query2="update  room set availblity='Occupied' where roomnumber="+room_no;
          con.statement.executeUpdate(query1);
          con.statement.executeUpdate(query2);
          JOptionPane.showMessageDialog(null,"New Customer Successfully Added");
          this.setVisible(false);

        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
      else
      {
        setVisible(false);
      }


    }

    public  static  void main(String[] args)
    {
        new CheckIn();
    }
}
