class Demomethods
{
	int fun()
	{ 
		int k,a=54,b=56;
		 k=a+b;
		return k;
	}	
}	
class Driver
{
	public static void main(String[] args)
	{
		Demomethods obj=new Demomethods();
		int s=obj.fun();
		System.out.println("the value of sum:"+s);
	}
}