import java.util.Scanner;
class Even
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the number");
int n=ob.nextInt();
if(n%2==0)
{
System.out.println("this is even no..");
}
else
{
System.out.println("this is odd no..");
}
}
}