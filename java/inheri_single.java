import java.util.Scanner;
class Car
{
	int sum=0,a,b;
	void fun()
	{
	
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the no");
	a=ob.nextInt();
	b=ob.nextInt();
	sum=a+b;
	System.out.println("sum="+sum);
	}
}
class Bike extends Car
{
	int sub=0,a,b;
	void fun2()
	{
	
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the no");
	a=ob.nextInt();
	b=ob.nextInt();
	sub=a-b;
	System.out.println("sub="+sub);
	}
	public static void main(String[] args)
	{
	Bike obj=new Bike();
	obj.fun();
	obj.fun2();
	}
}