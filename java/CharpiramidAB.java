 class CharpiramidAB
{
public static void main(String[] args)
{
int i,j,k;
char A=65;
for(i=1;i<=3;i++)
{
A='A';
	for(j=1;j<=3-i;j++)
	{
	System.out.print(" ");
	}
		for(k=1;k<=2*i-1;k++)
		{
		System.out.print(A++);
		}

System.out.println("");
}}}