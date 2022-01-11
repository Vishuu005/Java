class UltaPiramid
{
public static void main(String[] agr)
{
int i,j,k;
for(i=0;i<=5;i++)
{
for(j=5;j>=5-i;j--)
{
System.out.print(" ");
}
for(k=7;k>=2*i+1;k--)
{
System.out.print("*");
}
System.out.println("");
}
}
}