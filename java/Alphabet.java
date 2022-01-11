import java.util.Scanner;
class Alphabet 
{
char c;
public void fun()  
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the any Character");
c=ob.next().charAt(0);
if((c>='a' && c<='z')||(c>='A' && c<='Z'))
{
System.out.print(c+" " +"is Alphabets");
}
else
{
System.out.print(c+" "+"is not a Alphabets");
}
}

public static void main(String[] ardh)
{
Alphabet obj=new Alphabet();
obj.fun();
}
}  