class Override
{
Override(int a,int b)
{
int k=a+b;
System.out.println("the sum: "+k);
}
Override(int c,int d,int e)
{
int s=c+d+e;
System.out.println("the sum of:"+s);
}
public static void main(String[] args)
{
Override ob=new Override(12,45);
Override ob1=new Override(12,45,34);

}
}
