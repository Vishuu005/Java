//DISCOUNT IN PRACENTAGE
import java.util.Scanner;
 public class Discount
{
public void Dis()
{
System.out.println("WELCOME MY FINDOUT DISCOUNT METHOD ");
Scanner ob=new Scanner(System.in);
System.out.println("Enter the Original price");
float original_price=ob.nextFloat();
System.out.println("Enter the Pracentege Discount");
float Discount=ob.nextFloat();
float discount_price=original_price/Discount;
System.out.println("Discount price "+discount_price);
float final_price=original_price-discount_price;
System.out.println("Final price "+ final_price);
}
public static void main(String[] aregs)
{
Discount obj=new Discount();
obj.Dis();
}
}

