class OuterClass2
{
	static class InnerClass2
	{
	static void innerfxn()
	{
	System.out.println("hello static method");
	}
	}
}
class Main
{
public static void main(String[] args)
{
//OuterClass2.InnerClass2 obj=OuterClass2.new InnerClass();
OuterClass2.InnerClass2.innerfxn();
}
}							