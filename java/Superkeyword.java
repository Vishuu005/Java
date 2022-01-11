class Emp
{
void fun(int m,int n)
{
int k=n+m;
System.out.println("i am super"+k);
}
}
class Emp3 extends Emp
{
void fun(int i,int j)
{
super.fun(12,54);
int k=i+j;
System.out.println("i am using base"+k);
}
public static void main(String[] args)
{
Emp3 ob=new Emp3();
ob.fun(45,76);

}
}