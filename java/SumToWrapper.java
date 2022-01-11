class SumToWrapper
{
public static void main(String[] args)
{
//first program
/*int i=Integer.parseInt(args[0]);
int j=Integer.parseInt(args[1]);
int k=i+j;
System.out.print("SUM OF:"+k);
}
}*/
//SECOND PROGRAM


int sum=0;
for(int i=0;i<args.length;i++)
{
int k=Integer.parseInt(args[i]);
sum=sum+k;
}
System.out.print("sum :"+sum);
}}