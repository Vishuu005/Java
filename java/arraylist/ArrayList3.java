import java.util.ArrayList;
class ArrayList3
{
public static void main(String[] args)
{
ArrayList<String> Name=new ArrayList<String>();
Name.add("Avnish");
Name.add("yadav");
Name.add("Sunny");
for(String string:Name)
{
System.out.println(string);
}
System.out.println(Name.size());
}
}