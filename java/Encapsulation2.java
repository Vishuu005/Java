class Encap
{
private String name1;
public void setname1(String name)
{
this.name1=name;

}
public String getname1()
{
return name1;
}

public static void main(String[] args)
{
Encap ob=new Encap();
ob.setname1("Avnish");
String s=ob.getname1();
System.out.print(" "+s);
}
}
//by getter and setter method