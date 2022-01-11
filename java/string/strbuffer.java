import java.util.Scanner;
class strbuffer
{
public static void main(String[] args)
{
String name;
Scanner ob=new Scanner(System.in);
System.out.println("enter your name:");
name=ob.next();
System.out.println("the name is "+name);
StringBuffer name2=new StringBuffer();
//name2=ob.next();//error
name2.append(ob.nextLine());//skip the input
name2.append(" ");
name2.append(ob.next());
name2.append(name);
System.out.println("the name2 modifier value is"+name2);
System.out.println("the name2 modifier value is"+name);
}
}
