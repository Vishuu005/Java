class inheritance
{
	void fun()
	{
	System.out.println("mai hu Avnish yadav");
	}
}
class inherit extends inheritance
{
	void fun1()
	{
	System.out.println("mai hu Abhishek yadav");
	}
	public static void main(String[] args)
	{
	inherit obj=new inherit();
	obj.fun1();
	obj.fun();
	}
}