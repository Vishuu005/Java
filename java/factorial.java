import java.util.Scanner;
class Factorial
{
int n,i,fact=1,sum=0;
void fun()
{
Scanner ob=new Scanner(System.in);
System.out.println("entr the no...");
n=ob.nextInt();
System.out.println("print the factorial no");
for(i=1;i<=n;i++)
{
fact=fact*i;

}
System.out.println(fact);
}
public static void main(String[] args)
{
Factorial obj=new Factorial();
obj.fun();
}
}