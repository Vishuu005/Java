class PatternPool
{
public static void main(String[] ava)
{
int i,j,k;
for(i=0;i<=3;i++)
{
for(j=1;j<=(3-i);j++)
{
System.out.print(" ");
}
for(k=1;k<=(2*i-1);k++)
{
System.out.print("*");
}
System.out.println(" ");
}
for(i=1;i<3;i++)
{
for(j=i;j<=3-i;j++)
{
System.out.print(" ");
}
for(k=3;k>=2*i-1;k--)
{
System.out.print("*");
}
System.out.println(" ");
}
}}+