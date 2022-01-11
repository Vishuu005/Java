import java.util.Scanner;
class Login
{
class Logout
{
int a,b,sum,avg;
 void fun()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
a=obj.nextInt();
b=obj.nextInt();
sum=a+b;
System.out.println("SUM="+sum);
avg=sum/2;
System.out.println("Avg="+avg);
}
}
}
class Logup
{
public static void main(String[] args)
{
Login ob=new Login();
Login.Logout obje=ob.new Logout();
obje.fun();
}
}
