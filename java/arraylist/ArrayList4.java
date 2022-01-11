import java.util.ArrayList;
class ArrayList4
{
public static void main(String[] args)
{
ArrayList<String> obj=new ArrayList<String>();
obj.add("Avnish");
obj.add("yadav");
obj.add("Sunny");
obj.add("Manish");
obj.set(0,"Array");
obj.remove(0);
for(String str:obj)
{
System.out.println(str);
}
System.out.println(obj.size());
System.out.println(obj.get(0));
}
}