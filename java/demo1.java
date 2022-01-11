class Main
{
int id,age;
void fun(int id,int age)
{
this.id=id;
this.age=age;
System.out.println("id is "+id+"age is"+age);
display("Avnish");
}
void display(String name)
{

System.out.println("My Name is"+name);
}
public static void main(String[] args)
{

Main obj=new Main();
obj.fun(123,21);
}
}