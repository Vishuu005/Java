class OuterClass
{
private int i=50;
void show()
{
System.out.println("hii"+i);
}
	class InnerClass
	{
	private int i2=200;
	void innershow()
	{
	System.out.println("hello"+i2);
	}
}
public static void main(String[] args)
{
OuterClass objOuter=new OuterClass();
objOuter.show();
OuterClass.InnerClass objInner=objOuter.new InnerClass();
objInner.innershow();
}
}