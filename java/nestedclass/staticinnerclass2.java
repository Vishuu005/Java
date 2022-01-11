class OuterClass2
{
	static class InnerClass2
	{
	 void innerfxn()
	{
	System.out.println("hello static method");
	}
	}
void show()
{
 System.out.println("hello everyone outer method2");
}
}

class Main
{
public static void main(String[] args)
{

OuterClass2.InnerClass2 obj=new OuterClass2.InnerClass2();
obj.innerfxn();
OuterClass2 obj1=new OuterClass2();

obj1.show();
}
}							