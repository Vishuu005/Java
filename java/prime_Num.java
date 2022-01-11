class Prime_Num
{
public static void main(String[] args)
{
int i;
for(i=4;i<=20;i++)
{
if(i%2==0 ||i%3==0)
{
System.out.println("not a prime number "+i);
}
else 
{
//System.out.println(" prime no "+i);
continue;
}
}
}
}