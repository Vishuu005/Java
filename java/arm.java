import java.util.Scanner;
class Arm
{
int temp,n,r=0,sum=0;
public void fun()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
n=ob.nextInt();
temp=n;
while(n!=0)
{
r=n%10;
sum=sum+r*r*r;
n=n/10;
}
if(sum==temp)
{
System.out.println("armstrong no");
}
else
{
System.out.println("not armstong no");
}
}
public static void main(String[] args)
{
Arm obj=new Arm();
obj.fun();
}
}