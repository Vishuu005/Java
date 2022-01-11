import java.util.Scanner;
class Sumavg
{
int a,b,c,sum,avg;
void Avnish()
{
	Scanner ob=new Scanner(System.in);
	System.out.println("enter the first no..");
	a=ob.nextInt();
	System.out.println("enter the second no..");
	b=ob.nextInt();
	System.out.println("enter the third no..");
	c=ob.nextInt();
	System.out.println("print the sum no..");
	sum=a+b+c;
	System.out.println(sum);
	System.out.println("print the avg no..");
	avg=sum/3;
	
	System.out.println(avg);
}
public static void main(String[] args)
{
Sumavg obj=new Sumavg();
obj.Avnish();
}
}