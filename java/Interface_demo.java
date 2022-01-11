interface Interface_demo
{

}
interface Interface_demo1 extends Interface_demo
{

}
class Emp implements Interface_demo1,Interface_demo
{
 void fun()
{
System.out.println("hii how are you");
}
void fun2()
{
System.out.println("Awnish yadav is a good boy");
}
}
class Emp1
{
public static void main(String[] args)
{
Emp ob=new Emp();
ob.fun();
ob.fun2();
}
}