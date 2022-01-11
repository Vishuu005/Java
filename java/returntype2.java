import java.util.Scanner;
class Demomethod
{
	int fun()
	{
		int k,a,b;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no");
		a=ob.nextInt();
		System.out.println("enter the second no");
		b=ob.nextInt();
		k=a+b;
		return k;
	}
//}
//class Driver
//{
	public static void main(String[] args)
	{
		Demomethod obj=new Demomethod();
		int s=obj.fun();
		System.out.println("sum of no:"+s);
	}
} 