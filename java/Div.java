class Div
{
	int a=3/4;
	int b=5/4;
	int sum=0;
	void fun()
	{
		sum=a+b;
		System.out.println("Sum="+sum);
	}
	public static void main(String[] args)
	{
		Div ob=new Div();
		ob.fun();
	}
}