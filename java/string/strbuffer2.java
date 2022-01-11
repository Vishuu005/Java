class strbuffer2
{
public static void main(String[] args)
{
String a=new String("Avnish");
String b=new String("Avnish");
System.out.println(a==b);//false
System.out.println(a.equals(b));//true
StringBuffer a1=new StringBuffer("Avnish");
StringBuffer b1=new StringBuffer("Avnish");
System.out.println(a1==b1);//false
System.out.println(a1.equals(b1));//false

//string immutable
String nam=new String("yadav");
nam.concat("avnish");
System.out.println(nam);
System.out.println(nam.concat("avnish"));


// string mutable
StringBuffer n=new StringBuffer("hello");
n.append("avnish");
System.out.println(n);//helloavnish
//StringBuffer ob=new StringBuffer(1000);//1000 store area
StringBuffer ob=new StringBuffer("hello");
ob.append("avnish");
System.out.println(ob.capacity());
System.out.println(ob);
}
}