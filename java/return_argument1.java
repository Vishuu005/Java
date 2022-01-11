class Emp
{
public int fun(int i,int j)
{
int k=i+j;
return k;
}
public static void main(String[] args)
{
Emp ob=new Emp();
int z=ob.fun(12,65);
System.out.println("sum:"+z);
}
}