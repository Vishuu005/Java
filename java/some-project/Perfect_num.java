//(2) program
//THIS PROGRAM IS FINDOUT FERFECT NUMBER EX-28=1+2+4+7+14=28 perfect num,
//22=1+2+11=22 not perfect num

class Perfect_num
{
public static void main(String[] args)
{
int i, n=22,sum=0,r=0;
int temp=n;
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
System.out.println(i);
}
else
{
continue;
}
}
if(temp==sum)
{
System.out.println("perfect no ");
}
else
{
System.out.println("not a perfect no");

}
}
}