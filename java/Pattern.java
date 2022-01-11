class Pattern
{
public static void main(String[] args)
{
int i,j,k;
for(i=0;i<=3;i++)
{
for(j=1;j<=(2*i-1);j++)
{
System.out.print(" ");
}
for(k=1;k<=(2*i+1);k++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}