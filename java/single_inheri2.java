class Emp1
{
protected static void fun()
{
System.out.println("hii all of you");
}
}
class Emp2 extends Emp1
{
 protected static void fun1()
{
System.out.println("good morning");
}
public static void main(String[] args)
{
Emp2 ob=new Emp2();
ob.fun();
ob.fun1();
}
}