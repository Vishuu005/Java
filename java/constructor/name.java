class Car
{
String name;
int age;
private Car(String name,int age)
{
this.name=name;

this.age=age;
}
void display()
{
System.out.println("My Name is "+name+"\n"+"My age is "+age);
}
Car(int a,String n)
{
System.out.println("My age is "+a+"My Name is "+n);
}


public static void main(String[] args)
{
Car ob=new Car("Avnish yadav",21);
Car ob1=new Car(22,"Avnish ");

ob.display();

}
}


