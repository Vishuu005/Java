import java.util.Scanner;
class Array
{
	 static int a,i,sum=0;
	public static void main(String[] args)
	{
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the Array size");
		int a=ob.nextInt();
		for(i=0;i<=a;i++)
		{
			
			int b=ob.nextInt();	
			sum=sum+b;
		}
		System.out.println("sum="+sum);

		/*for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				System.out println(a[][]);
			}
		}*/
	}
}