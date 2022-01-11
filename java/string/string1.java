class string1
{
public static void main(String[] args)
{
String obj=new String("Avnish");
String obj1=new String("Avnish");
String name="Avnish";
String name1="Avnish";
System.out.println(obj==obj1);//false
System.out.println(name1==name);//true
System.out.println(obj==name);//false
System.out.println(obj.equals(name));//true this is check only content
}
} 