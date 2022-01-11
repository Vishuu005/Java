class Overloading
{
public void fun(int a,int b)
{
int k=a+b;
System.out.println("fun 1:"+k);
}
}
class Overload extends Overloading
{
public void fun(int c,int d,int e)
{
int l=c+d+e;
System.out.println("fun2 :"+l);
}

public static void main(String[] args)
{
Overload ob=new Overload();
ob.fun(12,23);
ob.fun(13,34,56);
}
}