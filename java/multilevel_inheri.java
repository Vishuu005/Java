import java.util.Scanner;
class Emp1
{
int a,b,sum=0;
void fun()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
a=ob.nextInt();
b=ob.nextInt();
sum=a+b;
System.out.println("SUM="+sum);
}
}
class Emp2 extends Emp1
{
int c,d,sub=0;
void fun1()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the no");
c=obj.nextInt();
d=obj.nextInt();
sub=c-d;
System.out.println("Sub="+sub);
}
}
class Emp3 extends Emp2
{
int e,f,div=0;
void fun2()
{
Scanner o=new Scanner(System.in);
System.out.println("enter the no");
e=o.nextInt();
f=o.nextInt();
div=e/f;
System.out.println("Div="+div);
}

public static void main(String[] args)
{
Emp3 obje=new Emp3();
obje.fun1();
obje.fun();
obje.fun2();

}
}