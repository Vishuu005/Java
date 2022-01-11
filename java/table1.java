import java.util.Scanner;
class table
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the number");
int n=ob.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+" * "+i+"= "+n*i);
}
}
}