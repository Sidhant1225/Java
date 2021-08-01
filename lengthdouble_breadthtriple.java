import java.util.Scanner;
class rectangle
{
int l,b;
void setdata(int a,int c)
{
l=a;
b=c;
}
void display()
{
System.out.println("area is "+l*b);
}
}
class areaOfRect
{
static void increment(rectangle p)
{
p.l=p.l*2;
p.b=p.b*3;
}
public static void main(String args[])
{
rectangle r=new rectangle();
r.setdata(5,6);
r.display();
increment(r);
r.display();
}
}
