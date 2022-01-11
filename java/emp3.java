import java.util.Scanner;
class emp
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the array of no");
int n=obj.nextInt();
String name[]=new String[n];
String nam[]=new String[n];
int age[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the name");
name[i]=obj.nextLine();
System.out.println("enter the nam");
nam[i]=obj.nextLine();
System.out.println("enter the age");
age[i]=obj.nextInt();
}
System.out.println("print the value");
for(int i=0;i<n;i++)
{
System.out.println("my name is ="+name[i]);
System.out.println("my nam is ="+nam[i]);
System.out.println("my nam is ="+age[i]);
}
}
}