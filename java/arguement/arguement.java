class Demo
{
	void fun(int a,int b)
	{
		 a=23;
		 b=34;
		int k=a+b;
		System.out.print("sum:"+k);
	}
	public static void main(String[] args)
	{
		int c=44,d=55;
		Demo obj=new Demo();
		obj.fun(c,d);
	}
}