//Static Innerclass ********************
 class Outer
{
	staicclass Inner
	{
	static void fun()
	{
	System.out.println("hii friends how are you");
	}
}
}
class Emp
{
public static void main(String[] args)
{
Outer.Inner obj=new Outer.Inner();
obj.fun();
}
} 