class Parent
{
protected void fun()
{
System.out.println("hii friends how are you");
}}
class Child extends Parent
{
public static void main(String[] args)
{
Parent ob=new Parent();
ob.fun();
}
}