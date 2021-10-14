import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class splashscreen extends JFrame 
{
JLabel l1,l2,l3,l4;
Font f;
public splashscreen()
{
l1=new JLabel("INVENTORY");
l2=new JLabel("CONTROL");
l3=new JLabel("SYSTEM");
l4=new JLabel("SUBMITTED BY:SIDHANT");

f=new Font("Monotype Corsiva",Font.PLAIN,40);
l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
l4.setFont(f);

setLayout(null);
l1.setBounds(100,100,500,40);
l2.setBounds(300,200,500,40);
l3.setBounds(500,300,500,40);
l4.setBounds(100,400,500,40);

add(l1);
add(l2);
add(l3);
add(l4);
}
public static void main(String args[])
{
splashscreen s=new splashscreen();
s.setSize(800,400);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("Splash Screen");
s.setVisible(true);
}
}