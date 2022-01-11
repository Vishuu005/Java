import java.util.Scanner;
class Program3
{
public static void main(String[] rags)
{
int ptika=50,pchaumin=100,pburgur=60,pdhosha=60, amount=0;


Scanner obj=new Scanner(System.in);
System.out.println("**********WELCOME TO MY Fast-FOOD RESTURENT**********\n");
System.out.println("(1)Panir-tika price=50 (2)Panir-Chaumin price=100\n (3)Panir-Burgur price=60 (4) Panir-Dhosha price=60\n");

while(true)
{
System.out.println("anythink else reply (y/n)");
char y=obj.next().charAt(0);
if(y=='y'||y=='Y')
{
System.out.println("choose the food and enter the number");
int menuname=obj.nextInt();
switch(menuname)
{
case 1:
	System.out.println("THANKS FOR CHOOSING PANIR-TIKA\n");
	System.out.println("price is 50 rupee");
	amount+=ptika;
	System.out.println("YOUR PRICE IS "+amount);
	break;
case 2:
	System.out.println("THANKS FOR CHOOSING PANIR-CHAUMIN\n");
	amount+=pchaumin;
	System.out.println("YOUR PRICE IS "+amount);
	break;
case 3:
	System.out.println("THANKS FOR CHOOSING PANIR-Burgur\n");
	amount+=pburgur;
	System.out.println("YOUR PRICE IS "+amount);
	break;
case 4:
	System.out.println("THANKS FOR CHOOSING PANIR-DHOSHA\n");
	amount+=pdhosha;
	System.out.println("YOUR PRICE IS "+amount);
	break;
default:
	System.out.println("invalid option");
}
}
else
{
break;
}
}
System.out.println("total amount is "+amount);
}
}