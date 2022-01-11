import java.util.Scanner;
class InputPiramid
{
public static void main(String[] args)
{
int i,j,k;
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
int n=ob.nextInt();
for(i=1;i<=n;i++)
{
	for(j=n;j>=i;j--)
	{
	System.out.print(" ");
}
for(k=1;k<=2*i-1;k++)
{
System.out.print("*");
	}
System.out.println("");
}
}
}