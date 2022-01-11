class Overloading
{
public void fun(int a,int b)
{
int k=a+b;
System.out.println("fun 1:"+k);
}
public void fun(int a,int b,int c)
{
int l=a+b+c;
System.out.println("fun2 :"+l);
}
}
class Detail
{
public static void main(String[] args)
{
Overloading ob=new Overloading();
ob.fun(12,23);
ob.fun(13,34,23);
}
}
//we  can create same class and Different class but arguement different by polimorfism