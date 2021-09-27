import java.util.Scanner;
class time
{
int hrs,min;

void setdata(int a,int b)
{
hrs=a;
min=b;
}
void display()
{
System.out.println("Time is "+hrs+":"+min);
}
void sum(time p)
{
hrs=hrs+p.hrs;
min=min+p.min;
if(min>=60)
{
hrs=hrs+1;
min=min-60;
}
}
}
class timedemo
{
public static void main(String args[])
{
time t1=new time();
time t2=new time();
t1.setdata(3,50);
t2.setdata(4,40);
t2.sum(t1);
t1.display();
t2.display();
}
}