class jaggedcalling
{
public static void main(String args[])
{
int i,j;

int a[][]=new int[3][];
a[0]=new int[3];
a[1]=new int[4];
a[2]=new int[2];

for(i=0;i<a.length;i++)
{
System.out.println();
for(j=0;j<a[i].length;j++)
{
a[i][j]=i;
}
}
for(i=0;i<a.length;i++)
{
System.out.println();
for(j=0;j<a[i].length;j++)
{
System.out.println(a[i][j]+" ");
}
}
}