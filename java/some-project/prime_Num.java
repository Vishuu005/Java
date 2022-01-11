//some mistake
//(3) program
class Prime_Num
{
public static void main(String[] args)
{
int i;
for(i=2;i<=101;i++)
{
if(i%2==0 ||i%3==0||i%5==0||i%7==0)
{

continue;
}
else 
{
System.out.println(" prime no "+i);

}
}
}
}