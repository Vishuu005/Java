abstract class Demo
{
void a()
{
System.out.println("hii people");
}
abstract void show();
}
class Main
{
public static void main(String[] args)
{
Demo obj=new Demo()
{
void show()
{
System.out.println("This is abstract method");
}
};
obj.a();
obj.show();
}
} 