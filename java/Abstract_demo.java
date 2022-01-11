abstract class Abstract_demo
{
 abstract void fun();
void fun3()
{
System.out.println("awnish yadav");
}
abstract void fun5();
}
class Emp extends Abstract_demo
{

@Override
void fun()
{
System.out.println("hii how are you");
}
void fun5()
{
System.out.println("hlo");
}
public static void main(String[] args)
{
Emp ob=new Emp();
ob.fun();
ob.fun3();
ob.fun5();

}
}