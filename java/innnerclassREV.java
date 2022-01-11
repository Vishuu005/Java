import java.util.Scanner;
class Reverse
{
	class Rev
	{
	int a,rem=0,sum=0;
	void fun()
	{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the no");
	a=ob.nextInt();
	while(a!=0)
	{
	rem=a%10;
	sum=sum*10+rem;
	a=a/10;
	}
	System.out.println("Reverse="+sum);
	}}}
class Revs
{
public static void main(String[] args)
{
Reverse obj=new Reverse();
Reverse.Rev obje=obj.new Rev();
obje.fun();
}
}