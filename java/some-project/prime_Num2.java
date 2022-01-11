class Prime_Num2
{
public static void main(String[] args)
{
int no=11,temp=0,i;
for(i=2;i<=no-1;i++)
{
if(no%i==0)
{
temp=temp+1;
}
}
if(temp>0)
{
System.out.println("not a prime no");
}
else
{
System.out.println("prime number");
}
}
}