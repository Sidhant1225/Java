class media
{
int rate;
String title;

void getmedia(int rate,String title)
{
this.rate=rate;
this.title=title;
}
void putmedia()
{
System.out.println("Rate of media is "+rate);
System.out.println("title of media is "+title);
}
}

class book extends media
{
int nop;

void getbook(int n)
{
nop=n;
}

void putbook()
{
System.out.println("no of pages of book named "+title+" are "+nop);
}
}

class tape extends media
{
int time;
void gettape(int time)
{
nop=n;
}

void puttape()
{
System.out.println("");
}

}

class mediademo
{
public static void main(String args[])
{

}
}