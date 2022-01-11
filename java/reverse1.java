class reverse1
{
public static void main(String[] args)
{
long n=1234567765,r,rev=0;

while(n!=0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println("Reverse no="+rev);
}
}

