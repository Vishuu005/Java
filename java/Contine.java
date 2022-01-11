import java.util.Scanner;
class Contine
{
public static void main(String[] args)
{
int name,fast;
System.out.println("*****WELCOME TO MY CONTINE*****\n");
System.out.println("1.BREAKFAST\n2.LUNCH\n3.DINNER");
Scanner ob=new Scanner(System.in);
System.out.println("plz enter the menu");
name=ob.nextInt();
switch(name)
{
case 1: System.out.println("1.TEA=Rs10\n2.COFFIEE=Rs20\n3.COLD COFFIEE=Rs40\n");
	break;
	//Scanner obj=new Scanner(System.in);
System.out.println("enter the name");
	//int fast=ob.nextInt();
	//again use switch case***
	//switch(fast)
	//{
	case 1: System.out.println("thanks for tea"); 
	break;
	case 2: System.out.println("thanks for coffiee");
	break; 
	case 3: System.out.println("thanks for cold coffiee"); 
	break;
	//}
case 2:System.out.println("hii");
	break;
case 3:System.out.println("hii");
	break;
default:System.out.println("invalid");
	break;
}}}