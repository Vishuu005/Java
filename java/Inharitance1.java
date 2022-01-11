class Inheritance
{
public void fun()
{
System.out.println("hlo everyone");
}}
class Inherit extends Inheritance
{
public void fun1()
{
System.out.println("good afternoon");
}
/*public void fun()
{
System.out.println("good morning");
}*/}
class Emp
{
public static void main(String[] args)
{
Inherit ob=new Inherit();
ob.fun();
ob.fun1();
}
}
