import java.util.Scanner;
class room
{
int l,b,h;

void getdata(int x,int y,int z)
{
l=x;
b=y;
h=z;
}

int volume()
{
int v;
v=l*b*h;
return v;
}
}

class vol
{
public static void main(String args[])
{
room r=new room();
int p,q,s,v;
Scanner kb=new Scanner(System.in);
System.out.println("Enter Length");
p=kb.nextInt();
System.out.println("Enter Breadth");
q=kb.nextInt();
System.out.println("Enter Height");
s=kb.nextInt();
r.getdata(p,q,s);
v=r.volume();
System.out.println("Volume is "+v);
}
}