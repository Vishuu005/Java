//SINGLE LEVEL INHERITANCE*******************************
import java.util.Scanner;
class Calculator
{
	int a,b,sum=0;
	public void add()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no");
		a=ob.nextInt();
		b=ob.nextInt();
		sum=a+b;
		System.out.println("Sum="+sum);
	}
}
class Calculator2 extends Calculator
{
	int a,b,sub=0;
	public void sub()
	{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the sub no");
	a=ob.nextInt();
	b=ob.nextInt();
	sub=a-b;
	System.out.println("Sub="+sub);
	} 
	public static void main(String[] args)
	{
		Calculator2 obj=new Calculator2();
		obj.sub();
		obj.add();

	}
}
