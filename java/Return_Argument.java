class Return_Argument
{
public static int fun(int i,int j)
{
int s=i+j;
return s;
}
}   
class Return_Argument1
{
public static int main(String[] args)
{
int p=Return_Argument.fun(21,67);
System.out.print("sum of:"+p);
}
} 