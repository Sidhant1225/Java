import java.util.Scanner;
class GradingSystem
{
public static void main(String args[])
{
int marks;
Scanner kb=new Scanner(System.in);
System.out.println("Enter total Marks of Student:");
marks=kb.nextInt();
if(marks<25){
System.out.println("Student got F grade");}

else if((marks>=25) && (marks<45))
System.out.println("Student got E grade");

else if((marks>=45) && (marks<50))
System.out.println("Student got D grade");

else if((marks>=50) && (marks<60))
System.out.println("Student got C grade");

else if((marks>=60) && (marks<80))
System.out.println("Student got B grade");

else if(marks>=80)
System.out.println("Student got A grade");
}
}