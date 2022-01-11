import java.util.Scanner;
class NamePrint
{
String id;
String name;
String number;
String address;
void fun()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the id");
id=ob.nextLine();
System.out.println("enter the name");
name=ob.nextLine(); 
System.out.println("enter the number");
number=ob.nextLine();
System.out.println("enter the address");
address=ob.nextLine();
System.out.println("my id is"+" "+id);
System.out.println("my name is"+"  "+name);
System.out.println("my number is"+"   "+number);
System.out.println("my address is"+"  "+address);
}
public static void main(String[] arg)
{
NamePrint obj=new NamePrint();
obj.fun();
}}