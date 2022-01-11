interface Multiple
{
public void fun();
}
class Emp1 implements Multiple
{
public void fun()
{
System.out.println("hlo");
}
void fun1()
{
System.out.println("my love ");
}}
class Emp2
{
public static void main(String[] args)
{
int i;


Emp1 ob=new Emp1();
for(i=1;i<=5;i++)
{
ob.fun();
ob.fun1();
}
}
}