 import java.util.Scanner;

class Program
{
public static void main(String[] args)
{
float price,quantity,amount=0;
float temp=amount;
System.out.println("*******WELCOME TO MY KIRANA SHOP********\n");
while(true)
{
Scanner ob=new Scanner(System.in);
System.out.println("are you want to continiue"); 
char y=ob.next().charAt(0);
if(y=='y'||y=='Y')
{
//enter the thing name
System.out.println("what you want");
String name=ob.next();
//enter the quantity
System.out.println("tell me Quentity");
quantity=ob.nextFloat();

//enter the price
System.out.println("enter the price");
price=ob.nextFloat();
//total amount
System.out.println("your amount is");
amount=quantity*price;

System.out.println(amount);
temp+=amount;
}
else
{
break;
}}

System.out.println("YOUR TOTAL AMOUNT IS:->"+temp);
System.out.println("***************THANKS FOR SHOPPING**************");
}
}
