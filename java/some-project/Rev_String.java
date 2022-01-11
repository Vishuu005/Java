//(7) REVERSE A STRING
class Rev_String
{
public static void main(String[] args)
{
String name="Avnish";
int leng=name.length();
String rev="";
for(int i=leng-1;i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.println("my name is"+name+" \nreverse is "+rev);
}
}
