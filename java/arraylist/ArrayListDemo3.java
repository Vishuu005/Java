import java.util.ArrayList;

class ArrayListDemo3
{
public static void main(String[] args)
{
ArrayList<String> name=new ArrayList<String>();
name.add("Aman");
name.add("Rohan");
name.add("Rohan1");
name.add("rohan");
name.add("s");
name.add("1");
name.add("B");
System.out.println("0 th element is "+name.get(0));
name.set(2,"Rohit");
for(String string:name)
{
System.out.println(string);
}
}
}
