class Reverse_Num
{
public static void main(String[] rage)
{
int n=123456,r=0,sum=0;
while(n!=0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
System.out.println(sum);
}
}