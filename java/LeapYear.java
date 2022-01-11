import java.util.Scanner;
class LeapYear
{
int n;
public void fun()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
n=ob.nextInt();
if(n%4==0)
{
	if(n%100==0)
	{
		if(n%400==0)

		System.out.println("leap year");

		else

		System.out.println("not leap year");
		}
else
System.out.println("leap year");
}
else
System.out.println("leap year");
}

public static void main(String[] args)
{
LeapYear obj=new LeapYear();
obj.fun();
}
}