class Parent
{
protected void fun()
{
System.out.println("hii friends how are you");
}}
class Child extends Parent
{
private void fun1()
{
System.out.println("hii");
}
public static void main(String[] args)
{
Child ob=new Child();
ob.fun();
ob.fun1();

}
}