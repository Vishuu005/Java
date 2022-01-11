import java.util.Scanner;
 public class Program2
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
float a,b,c,d,sum=0,sub=0,div=0,multi=0,avg=0;
System.out.println("enter the first input");
a=obj.nextFloat();
System.out.println("enter the second input");
b=obj.nextFloat();
System.out.println("enter the third input");
c=obj.nextFloat();
System.out.println("enter the forth input");
d=obj.nextFloat();
sum=a+b+c+d;
avg=sum/4;
sub=a-b-c-d;
div=a/b/c/d;
multi=a*b*c*d;
System.out.println("sum="+sum+"avg="+avg+"sub="+sub+"div="+div+"muli="+multi);
}
}