package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception()
    {
        JPanel panel =new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1258,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIconr=new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i3=imageIconr.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(i3);
        JLabel label2=new JLabel(imageIcon3);
        label2.setBounds(250,20,500,500);
        panel.add(label2);


        JPanel panel1 =new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIconl=new ImageIcon(i1);
        JLabel label=new JLabel(imageIconl);
        label.setBounds(5,450,250,250);
        panel1.add(label);

        JButton btnNCF=new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   if (e.getSource()==btnNCF)
                   {
                       new CheckIn();

                   }


               }
               catch (Exception E)
               {
                 E.printStackTrace();
               }

            }



        });









        JButton btnROOM=new JButton("Room");
        btnROOM.setBounds(30,70,200,30);
        btnROOM.setBackground(Color.BLACK);
        btnROOM.setForeground(Color.WHITE);
        panel1.add(btnROOM);
        btnROOM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnROOM)
                    {
                        new Room();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });



        JButton btnDPT=new JButton("Department");
        btnDPT.setBounds(30,110,200,30);
        btnDPT.setBackground(Color.BLACK);
        btnDPT.setForeground(Color.WHITE);
        panel1.add(btnDPT);
        btnDPT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnDPT)
                    {
                        new Department();


                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });





        JButton btnEINFO=new JButton("All Employee Info");
        btnEINFO.setBounds(30,150,200,30);
        btnEINFO.setBackground(Color.BLACK);
        btnEINFO.setForeground(Color.WHITE);
        panel1.add(btnEINFO);
        btnEINFO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnEINFO)
                    {
                           new Allemployee();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnCINFO=new JButton("Manger Info");
        btnCINFO.setBounds(30,190,200,30);
        btnCINFO.setBackground(Color.BLACK);
        btnCINFO.setForeground(Color.WHITE);
        panel1.add(btnCINFO);
        btnCINFO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnCINFO)
                    {
                        new mangerinfo();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnCOUT=new JButton("Check Out");
        btnCOUT.setBounds(30,230,200,30);
        btnCOUT.setBackground(Color.BLACK);
        btnCOUT.setForeground(Color.WHITE);
        panel1.add(btnCOUT);
        btnCOUT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnCOUT)
                    {
                        new checkout();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnCIN=new JButton("Update Check-in-Details");
        btnCIN.setBounds(30,270,200,30);
        btnCIN.setBackground(Color.BLACK);
        btnCIN.setForeground(Color.WHITE);
        panel1.add(btnCIN);
        btnCIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnCIN)
                    {
                        new updatecheck();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });



        JButton btnRS=new JButton("Update Room Status");
        btnRS.setBounds(30,310,200,30);
        btnRS.setBackground(Color.BLACK);
        btnRS.setForeground(Color.WHITE);
        panel1.add(btnRS);
        btnRS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnRS)
                    {
                        new updateroom();

                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnPUS=new JButton("Pick up Service");
        btnPUS.setBounds(30,350,200,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnPUS)
                    {
                         new Pickup();
                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnSR=new JButton("Room Search");
        btnSR.setBounds(30,390,200,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnSR)
                    {
                       new SearchRoom();


                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });



        JButton btnLO=new JButton("Log Out");
        btnLO.setBounds(20,440,100,30);
        btnLO.setBackground(Color.BLACK);
        btnLO.setForeground(Color.WHITE);
        panel1.add(btnLO);
        btnLO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnLO)
                    {


                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });




        JButton btnBU=new JButton("Back");
        btnBU.setBounds(150,440,100,30);
        btnBU.setBackground(Color.BLACK);
        btnBU.setForeground(Color.WHITE);
        panel1.add(btnBU);
        btnBU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource()==btnBU)
                    {
                        new Dashbord();
                        setVisible(false);


                    }


                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }

            }



        });







        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);



    }
    public  static  void main(String[] args)
    {
        new Reception();
    }
}
