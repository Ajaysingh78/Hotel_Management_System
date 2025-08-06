package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashbord  extends JFrame implements ActionListener {
    JButton admin, rec;
    Dashbord()
    {
        super("Hotel Mangement System");
        rec= new JButton("RECEPTION");
        rec.setBounds(365,480,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        ImageIcon imageIconr=new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3=imageIconr.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(i3);
        JLabel label2=new JLabel(imageIcon3);
        label2.setBounds(330,280,200,195);
        add(label2);


//


        admin= new JButton("ADMIN");
        admin.setBounds(800,480,140,30);
        admin.setFont(new Font("Tahoma",Font.BOLD,15));
        admin.setBackground(new Color(255,98,0));
        admin.setForeground(Color.WHITE);
        admin.addActionListener(this);
        add(admin);







        ImageIcon imageIconb=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2=imageIconb.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(i2);
        JLabel label1=new JLabel(imageIcon2);
        label1.setBounds(760,280,200,195);
        add(label1);






        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1090);
        add(label);


      setUndecorated(false);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rec)
        {
            new Reception();


        }
        else {

            new login2();
        }
    }

    public  static  void main(String[] args)
{
    new Dashbord();

}
}
