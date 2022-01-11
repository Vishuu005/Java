import java.util.Scanner;
class ArraySum
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the first matrix size");
int n=obj.nextInt();
System.out.println("enter the second matrix size");
int p=obj.nextInt();
int a[][]=new int[n][p];
int b[][]=new int[n][p];
int c[][]=new int[n][p];
System.out.println("enter the first matrix");
for(int i=0;i<n;i++)
{
	for(int j=0;j<p;j++)
	{
	a[i][j]=obj.nextInt();
	}
}
System.out.println("enter the second matrix ");
for(int i=0;i<n;i++)
{
	for(int j=0;j<p;j++)
	{
	b[i][j]=obj.nextInt();
	}
}
for(int i=0;i<n;i++)
{
	for(int j=0;j<p;j++)
	{
	c[i][j]=a[i][j]-b[i][j];
	}
}
System.out.println("sum matrix ");
for(int i=0;i<n;i++)
{
	for(int j=0;j<p;j++)
	{
	System.out.print(c[i][j]+" ");
	}
System.out.println(" ");
}
}
}
 