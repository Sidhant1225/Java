import java.awt.*;
import java.applet.Applet;

/*<applet code="house.class" height=800 width=800></applet>*/

public class house extends Applet
{
 public void init()
{
setForeground(Color.red);
setBackground(Color.white);
}
public void paint(Graphics g)
{
int xpts[]={250,100,400,250};
int ypts[]={100,400,400,100};


g.fillPolygon(xpts,ypts,4);
}
}