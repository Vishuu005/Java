import java.util.Scanner;
class Piramid
{
public static void main(String[] args)
{
int i,j,k,n;
Scanner ob=new Scanner(System.in);
n=ob.nextInt();
for(i=0;i<=n;i++)
{
for(j=1;j<=(n-i);j++)
{
System.out.print(" ");
}
for(k=1;k<=(2*i-1);k++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}