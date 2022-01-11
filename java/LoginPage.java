import java.util.Scanner;
class LoginPage
{
public static void main(String[] args)
{
String id;
String password;
Scanner ob=new Scanner(System.in);
System.out.println("enter the id plz");
id=ob.next();
/*System.out.println("enter the password");
password=ob.next();*/
if(id=="avnish")
{
System.out.println("WELCOME TO MY SITE");
}
else
{
System.out.println("invalide login plz try again");
}
}
}