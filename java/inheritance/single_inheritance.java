class Emp 
{
	void fun()
	{
		System.out.println("hii Avnish yadav");
	}

}
class Emp1 extends Emp
{
	void fun1()
	{
		System.out.println("hlo dost");
	}
	public static void main(String[] rags)
	{
		Emp1 ob=new Emp1();
		ob.fun();
		ob.fun1();
	}
}