abstract class abc
{
abstract void fun();
}
class Main
{
public static void main(String[] args)
{
//abc obj=new abc();error we can't make abstract class object
abc obj=new abc()
{
void fun()
{
System.out.println("abstract method");
}
};
obj.fun();
}
}