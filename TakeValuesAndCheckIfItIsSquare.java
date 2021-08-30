import java.util.Scanner;
class CheckSquare
{
public static void main(String args[])
{
int l,b;
Scanner kb=new Scanner(System.in);
System.out.println("Enter value of length");
l=kb.nextInt();
System.out.println("Enter value of breadth");
b=kb.nextInt();
if(l==b)
{
System.out.println("It is a square");
}
else
{
System.out.println("It is not a square");
}
}
}