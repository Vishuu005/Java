class Encap
{
private String name1;
public void setname1(String name)
{
this.name1=name;
System.out.println("hii"+this.name1+"\n");
}
public void fun()
{
System.out.println("the value set to name 1:"+name1);
}

public static void main(String[] args)
{
Encap ob=new Encap();
ob.setname1("Avnish");
ob.fun();
}
}