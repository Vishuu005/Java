import java.util.*;
class Iterator
{
public static void main(String[] args)
{
ArrayList<String> Name=new ArrayList<String>();
Name.add("Aman");
Name.add("Rohan");
Name.add("Avnish");
Name.add("yadav");
Name.add("s");
Name.add("1");
Collections.sort(Name);
Iterator objIterator=Name.iterator();//getting the iterator
while(objIterator.hasNext())
{
System.out.println(objIterator.next());
}
}
}
//iterator work on array?