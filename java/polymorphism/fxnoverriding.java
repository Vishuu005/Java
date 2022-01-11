class A
{
void fxn()
{
System.out.println("parent class method");
}
}
class B extends A
{
void fxn()
{
System.out.println("Child class method");
}
void disply()
{
fxn();
super.fxn();
}

public static void main(String[] args)
{
//B ob=new B();
//ob.fxn();
//A obj=new A();
//obj.fxn();
B obj1=new B();//jiska constructor call krenge uska fxn call hoga
obj1.disply();//super keyword use and call parent and child class

}
}
