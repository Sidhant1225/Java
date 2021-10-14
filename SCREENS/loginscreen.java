import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginscreen extends JFrame
{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2,b3;

public loginscreen()
{
l1=new JLabel("LOGIN SCREEN");
l2=new JLabel("USERNAME:");
l3=new JLabel("PASSWORD:");
t1=new JTextField(20);
t2=new JTextField(20);
b1=new JButton("LOGIN");
b2=new JButton("CREATE USER");
b3=new JButton("CANCEL");

setLayout(null);
l1.setBounds(350,100,400,40);
l2.setBounds(100,200,200,40);
l3.setBounds(100,300,300,40);
t1.setBounds(400,200,300,40);
t2.setBounds(400,300,300,40);
b1.setBounds(100,500,100,40);
b2.setBounds(300,500,100,40);
b3.setBounds(500,500,100,40);

add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
}
public static void main(String args[])
{
loginscreen s=new loginscreen();
s.setSize(800,600);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setTitle("Login Screen");
s.setVisible(true);
}
}