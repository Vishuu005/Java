import java.util.Scanner;
class armstrongno
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the input ");
int n=obj.nextInt();
int sum=0,temp=0,r;
temp=n;
while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(temp==sum)
{
System.out.println("this is armstrong no");
}
else
{
System.out.println("not armstrong no");
}
}
}