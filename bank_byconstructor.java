import java.util.Scanner;
class bank
{
Scanner kb=new Scanner(System.in);
int accno;
String n;
double b;
bank(int accno,String name,Double bal)
{
b=bal;
}

void deposit()
{
int amount;
Scanner kb=new Scanner(System.in);
System.out.println("Enter amount");
amount=kb.nextInt();
b=b+amount;
System.out.println("deposited money is"+b);
}
void withdraw()
{
int amt;
Scanner kb=new Scanner(System.in);
System.out.println("Enter amt");
amt=kb.nextInt();
b=b-amt;
System.out.println("withdraw money is"+b);
}
}

class ban
{
public static void main(String args[])
{
int accno;
String n;
Double b;
Scanner kb=new Scanner(System.in);
System.out.println("Enter account no");
accno=kb.nextInt();
System.out.println("Enter name");
n=kb.nextLine();
System.out.println("Enter balance");
b=kb.nextDouble();
bank r=new bank(accno,n,b);
r.deposit();
r.withdraw();
}
}
