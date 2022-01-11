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
class Emp extends Inherit
{
void fun2()
{
System.out.println("good night");
}}
class Emp1
{
public static void main(String[] args)
{
Emp ob=new Emp();
ob.fun();
ob.fun1();
}
}
