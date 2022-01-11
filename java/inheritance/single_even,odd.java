import java.util.Scanner;
class Find
{
	void fun()
	{
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no");
		i=obj.nextInt();
		if(i%2==0)
		{
			System.out.println("this is even no");
		}
		else
		{
System.out.println("this is odd no..");
		}
		
	}
}
class Child extends Find
{
	public static void main(String[] args)
	{
		Child ob=new Child();
		ob.fun();
	}
}