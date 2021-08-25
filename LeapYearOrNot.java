import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
int y;
Scanner kb=new Scanner(System.in);
System.out.println("Enter Year:");
y=kb.nextInt();
if(y%4==0)
System.out.println("It is a leap year");
else
System.out.println("It is not a leap year");
}
}