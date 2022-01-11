public class ConstOver
{
int i;//instance variable
ConstOver()
{
System.out.println("default constructor");
}
ConstOver(int i)
{
System.out.println("i="+i);
}
void fxn()
{
System.out.println("hiii");
}
}
 class ConstOver1
{
public static void main(String[] args)
{
//new ConstOver(12).fxn();//next type
ConstOver ob=new ConstOver();
ConstOver ob1=new ConstOver(12);

ob.fxn();
}
}