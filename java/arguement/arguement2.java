import java.util.Scanner;
class Demo
{
	void fun(int a,int b)
	{
		Scanner ob=new Scanner(System.in);

		int c=a;
		c=ob.nextInt();
		int d=b;
		d=ob.nextInt();
		int k=d-c;
		System.out.print(k);
	}
	public static void main(String[] args)
	{
		int g=56,h=78,f;
		Demo obj=new Demo();
		obj.fun(g,h);
		f=g+h;
		System.out.println("Sum"+f);
	}
}