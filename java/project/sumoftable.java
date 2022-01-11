class SumOfTable
{
public static void main(String[] args)
{
float sum=0;
float avg=0;
for(int i=1;i<=100;i++)
{
sum=sum+i;
avg=sum/100;
}
System.out.println("Sum ="+sum);
System.out.println("Avg ="+avg);
}
}