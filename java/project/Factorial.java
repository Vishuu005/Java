import java.util.Scanner;
class Factorial
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int fact=1;
System.out.println("enter the factorial no");
int n=obj.nextInt();
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("FActorial of 1 to 10 numbers="+fact);
}
}