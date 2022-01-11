class Thread1
{
public static void main(String[] args)
{
System.out.println("hello Avnish");
System.out.println(Thread.currentThread().getName());//current thread name MAIN
Thread.currentThread().setName("Avnish");//change thread name Avnish
System.out.println("new Thread name"+Thread.currentThread().getName());
}
}