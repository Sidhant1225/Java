import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class issueScreen extends JFrame
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4,t5,t6;
JButton b1,b2,b3;

public issueScreen()
{
l1=new JLabel("ISSUE SCREEN");
l2=new JLabel("ICODE");
l3=new JLabel("INAME");
l4=new JLabel("RATE");
l5=new JLabel("QOH");
l6=new JLabel("DOI");
l7=new JLabel("QTY ISSUED");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
b1=new JButton("ISSUE");
b2=new JButton("CLEAR");
b3=new JButton("EXIT");

setLayout(null);
l1.setBounds(350,100,400,40);
l2.setBounds(100,200,200,40);
l3.setBounds(100,300,300,40);
l4.setBounds(100,400,300,40);
l5.setBounds(100,500,300,40);
l6.setBounds(100,600,300,40);
l7.setBounds(100,700,300,40);
t1.setBounds(400,200,300,40);
t2.setBounds(400,300,300,40);
t3.setBounds(400,400,300,40);
t4.setBounds(400,500,300,40);
t5.setBounds(400,600,300,40);
t6.setBounds(400,700,300,40);
b1.setBounds(100,800,100,40);
b2.setBounds(300,800,100,40);
b3.setBounds(500,800,100,40);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(b1);
add(b2);
add(b3);
}
public static void main(String args[])
{
issueScreen s=new issueScreen();
s.setSize(1000,1000);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("Stock Entry Screen");
s.setVisible(true);
}
}