class Encap
{
private String name1,phoneno1,id1;
public void setname1(String name)
{
this.name1=name;
System.out.println("my name is:"+this.name1);
}
public void setphoneno1(String phoneno)
{
this.phoneno1=phoneno;
System.out.println("phoneno is:"+this.phoneno1);
}
public void setid1(String id)
{
this.id1=id;
System.out.println("id is:"+this.id1);
}
public static void main(String[] args)
{
Encap ob=new Encap();
ob.setname1("Avnish yadav");
ob.setphoneno1("9718806938");
ob.setid1("123");
}
}