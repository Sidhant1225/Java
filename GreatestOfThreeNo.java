import java.util.Scanner;
class GreatestOfThreeNo
{
public static void main(String args[])
{
int a,b,c;
Scanner kb=new Scanner(System.in);
System.out.println("Enter First Value:");
a=kb.nextInt();
System.out.println("Enter Second Value:");
b=kb.nextInt();
System.out.println("Enter Third Value:");
c=kb.nextInt();

if(a>b && a>c)
System.out.println(a+" is greater");

else if(b>c && b>a)
System.out.println(b+" is greater");

else
System.out.println(c+" is greater");
}
}