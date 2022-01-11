class Emp
{
private int x;
private int y;
public int fun(int i,int j)
{
this.x=i;
this.y=j;
return x+y;
}
}
class Emp1
{
public static void main(String[] args)
{
Emp ob=new Emp();
int z=ob.fun(54,76);
System.out.println("sum:"+z);
}
}