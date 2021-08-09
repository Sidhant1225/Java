import java.util.Scanner;
class room
{
int l,b,h;

void getdata()
{
Scanner kb=new Scanner(System.in);
System.out.println("Enter Length");
l=kb.nextInt();
System.out.println("Enter Breadth");
b=kb.nextInt();
System.out.println("Enter Height");
h=kb.nextInt();
}

void volume()
{
int v;
v=l*b*h;
System.out.println("Volume is "+v);
}
}

class vol
{
public static void main(String args[])
{
room r=new room();
r.getdata();
r.volume();
}
}