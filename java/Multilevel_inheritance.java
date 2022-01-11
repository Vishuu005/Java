class Parent
{
void fun()
{
System.out.println("Awnish yadav is a good boy");
}
}
class Child extends Parent
{
void fun1()
{
System.out.println("hlo every one");
}
}
class Son extends Child
{
void fun2()
{
System.out.println("end the programs");
}
public static void main(String[] argd)
{
Son ob=new Son();
ob.fun();
ob.fun1();
ob.fun2();
}
}