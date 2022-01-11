import java.util.Scanner;
class Emp
{
public void fun(int i,int j)
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
i=ob.nextInt();
System.out.println("enter the second no");
j=ob.nextInt();
int k=i+j;
}
/*}
class Emp3 extends Emp
{
void fun(int i,int j)
{
System.out.println("enter thee no");
i=ob.nextInt();
System.out.println("enter the no");
j=ob.nextInt();
System.out.println("enter the no");
super.fun(i,j);
int k=i+j;
System.out.println(k);
}*/
public static void main(String[] args)
{
int a,b;
Emp obj=new Emp();
ob.fun(a,b);
}

}

