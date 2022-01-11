import java.util.Scanner;
class Swap
{
	
	public void fun()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no");
		int a=ob.nextInt();
		System.out.println("enetr the no");
		int b=ob.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println();
		System.out.println("first no"+" "+a);
		System.out.println("second no"+" "+b);
	}
	public static void main(String[] arg)
	{
		Swap obj= new Swap();
		obj.fun();
	}
}