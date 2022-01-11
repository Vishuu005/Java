class Thread2
{
public static void main(String[] args)
{
//System.out.println(Thread.currentThread().getName());
//System.out.println(10/0);//Main thread exception
Thread.currentThread().setName("Avnish");
System.out.println(10/0);


}
}