class exception3
{
public static void main(String[] args)
{
try
{
int arr[]=new int[3];//3
System.out.println("this code will run");

try
{
System.out.println("the value at arr[3] is "+arr[3]);//accesing 4th position exception occured at this line
}
catch(ArrayIndexOutOfBoundsException a)
{
//a.getMessage();this is working
System.out.println("plz access the right index og array !");
//a.printStackTrace();
}
System.out.println("this code will work");
System.out.println("this code will work");
System.out.println("this code will work");
System.out.println("this code will work");
System.out.println("this code will work");
System.out.println("this code will work");
}
catch(Exception abc)
{System.out.println("u r accessing wrong index position");
System.out.println(abc.getMessage());
}
System.out.println("this  code will work !");
}
}