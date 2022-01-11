class Const
{
int a;
Const(int b,String name)//pass int,String arguement
{
a=b;
System.out.println(a+name);
}
Const()//default constructor
{
System.out.println("hii everyone");
}
Const(String name,int a)//String,int constructor
{
System.out.println("my name is "+name+a);
}
public static void main(String[] args)
{
Const obj1=new Const(12,"sunny");
Const obj2=new Const();

Const obj3=new Const("Avnish yadav",13);


}
}