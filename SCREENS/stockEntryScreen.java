import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class stockEntryScreen extends JFrame
{
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4;
JButton b1,b2,b3;

public stockEntryScreen()
{
l1=new JLabel("STOCK ENTRY SCREEN");
l2=new JLabel("ITEM CODE");
l3=new JLabel("ITEM NAME");
l4=new JLabel("RATE");
l5=new JLabel("QOH");
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
b1=new JButton("INSERT");
b2=new JButton("CLEAR");
b3=new JButton("CANCEL");

setLayout(null);
l1.setBounds(350,100,400,40);
l2.setBounds(100,200,200,40);
l3.setBounds(100,300,300,40);
l4.setBounds(100,400,300,40);
l5.setBounds(100,500,300,40);
t1.setBounds(400,200,300,40);
t2.setBounds(400,300,300,40);
t3.setBounds(400,400,300,40);
t4.setBounds(400,500,300,40);
b1.setBounds(100,600,100,40);
b2.setBounds(300,600,100,40);
b3.setBounds(500,600,100,40);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(t1);
add(t2);
add(t3);
add(t4);
add(b1);
add(b2);
add(b3);
}
public static void main(String args[])
{
stockEntryScreen s=new stockEntryScreen();
s.setSize(1000,1000);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("Stock Entry Screen");
s.setVisible(true);
}
}