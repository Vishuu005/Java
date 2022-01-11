class OuterClass1
{
void methodLocal()
{
System.out.println("before class");

	class Methodlocal
	{
		int j=500;
	void show()
	{
	System.out.println("hello i am local class in a method"+j);
	}
	}
System.out.println("after class");
Methodlocal obj=new Methodlocal();
obj.show();
}
}
class Main
{
public static void main(String[] args)
{
OuterClass1 obj1=new OuterClass1();
obj1.methodLocal();
}
}
