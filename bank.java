import java.util.Scanner;
class bank
{
int accno;
String n;
Double b;
Scanner kb=new Scanner(System.in);

void getdata()
{
System.out.println("Enter account no");
accno=kb.nextInt();
System.out.println("Enter name");
n=kb.nextLine();
System.out.println("Enter balance");
b=kb.nextDouble();
}

void deposit()
{
int amount;
System.out.println("Enter amount");
amount=kb.nextInt();
b=b+amount;
System.out.println("deposited money is"+b);
}
void withdraw()
{
int amt;
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
bank r=new bank();
r.getdata();
r.deposit();
r.withdraw();
}
}