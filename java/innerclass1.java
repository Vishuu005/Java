//factorial innerclass*******************************************************************************
/*class Emp
{
	class Emp1
	{
	public void fun(int n)
	{
	
	int i,fact=1;
	for(i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println("factorial is :"+fact);
	}}

public static void main(String[] args)
{

Emp ob=new Emp();
Emp.Emp1 obj=ob.new Emp1();
obj.fun(5);
}
}*/ 




//REVERCE INNERCLASS BY USERINPUT*******************************************************************************
import java.util.Scanner;
class Emp
{
	class Emp1
	{
	public void fun()
	{
	int n,r=0,sum=0;
	System.out.println("enter the reverce no");
	Scanner obj1=new Scanner(System.in);
	n=obj1.nextInt();
	while(n!=0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	System.out.println("Reverce is:"+sum);
	}}
public static void main(String[] args)
{
Emp ob=new Emp();
Emp.Emp1 obj=ob.new Emp1();
obj.fun();
}
}
