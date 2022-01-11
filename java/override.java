class Overriding
{
public void fun()
{
System.out.println("hii");
}
}
class Overde extends Overriding
{
public void fun()
{
super.fun();
System.out.println("hii second");
}
public static void main(String[] args)
{
Overde ob=new Overde();
ob.fun();
}
}