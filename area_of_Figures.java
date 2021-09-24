import java.util.Scanner;
class area
{
double l,b,h;

area(double p)
{
l=p;
System.out.println(3.14*l*l);
}
area(double p,double q)
{
l=p;
b=q;
System.out.println(l*b);
}
area(double p,double q,double r)
{
l=p;
b=q;
h=r;
System.out.println(0.5*l*b*h);
}
}
class areaDiff
{
public static void main(String args[])
{
area sq=new area(3);
area rect=new rect(5,4);
area tri=new tri(9,5,7):
}
}