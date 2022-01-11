import java.util.ArrayList;
class remove
{
public static void main(String[] args)
{
ArrayList<String> Name=new ArrayList<String>();
Name.add("Avnish");
Name.add("yadav");
Name.add("Manish");
Name.add("Sunny");
//Name.remove(); error no such method
Name.remove(2);
Name.remove("yadav");
Name.add(1,"Sujata");
for(String string:Name)
{
System.out.println(string);
}
}
}