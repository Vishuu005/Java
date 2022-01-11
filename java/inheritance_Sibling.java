class Sibling
{
public void fun()
{
System.out.println("hello ji");
}
}
class Hello extends Sibling
{
public void fun()
{
System.out.println("mai Avnish yadav");
}
}
class Child extends Sibling
{
public void fun()
{
System.out.println("Aur aap kaise h");
}
public static void main(String[] args)
{
Sibling ob=new Sibling();
ob.fun();
Sibling ob1=new Hello();
ob1.fun();
Sibling ob2=new Child();
ob2.fun();
}
} 