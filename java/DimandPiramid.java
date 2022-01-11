import java.util.Scanner;
class DimandPiramid
{
int n;
public static void main(String[] args)
{
int i,j,k;
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
int n=ob.nextInt();
for(i=0;i<=n;i++)
{
for(j=n;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<=2*i-1;k++)
{
System.out.print("*");
} 
System.out.println("");
}

for(i=n-1;i>=0;i--)
{
for(j=n;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<=2*i-1;k++)
{
System.out.print("*");
} 
System.out.println("");
}
}}