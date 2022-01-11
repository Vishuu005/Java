interface Emp
{
public  void fun();
}
class Emp1 implements Emp
{
public void fun()
{
System.out.println("hello");
}
/*}
class Emp3
{*/
public static void main(String[] args)
{
Emp1 ob=new Emp1();
ob.fun();
}
} 