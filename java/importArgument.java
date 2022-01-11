import java.util.Scanner;
class Argument2
{
public static void fun(int i,int j)
{

Scanner ob=new Scanner(System.in);
i=ob.nextInt();
j=ob.nextInt();
int s=i+j;
System.out.print("sum of:"+s);
}}
class Argument3
{
public static void main(String[] args)
{
Argument2 obj=new Argument2();
obj.fun(1,6);
}}