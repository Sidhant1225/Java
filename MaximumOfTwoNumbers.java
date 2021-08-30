import java.util.Scanner;
class CheckMaximum
{
public static void main(String args[])
{
int a,b;
Scanner kb=new Scanner(System.in);
System.out.println("Enter First Value");
a=kb.nextInt();
System.out.println("Enter Second Value");
b=kb.nextInt();
if(a>b)
System.out.println(a+" is greater than "+b);
else
System.out.println(b+" is greater than "+a);
}
}