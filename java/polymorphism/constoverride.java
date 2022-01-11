class A
{
A()
{
System.out.println("A class constructor");
}
A(int a)
{
System.out.println("A class argue constructor"+a);
}
}
class B extends A
{
B()
{
System.out.println("B class constructor");
//super();//compiler already created a parent class object with default constructor 


}
public static void main(String[] args)
{
B ob=new B();
}
}