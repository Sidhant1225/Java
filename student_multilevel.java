class student
{
int rollno;
String name;

void setdata(int rno,String n)
{
rollno=rno;
name=n;
}
void putdata()
{
System.out.println("Rollno of student is "+rollno);
System.out.println("Name of student is "+name);
}
}

class test extends student
{
int mst1,mst2;

void setmarks(int m1,int m2)
{
mst1=m1;
mst2=m2;
}

void putmarks()
{
System.out.println(name+" first test marks are "+mst1);
System.out.println(name+" second test marks are "+mst2);
}
}

class result extends test
{
int total;

void display()
{
total=mst1+mst2;
System.out.println("Total marks of student are "+total);
}
}

class studentdemo
{
public static void main(String args[])
{
test t=new test();
t.setdata(25,"Sidhant");
t.putdata();
t.setmarks(80,90);
t.putmarks();
result r=new result();
r.setmarks(80,90);
r.display();
}
}