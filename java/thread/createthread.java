//smart programming for creating thread 
class Test extends Thread
{
public void run()
{
Thread.currentThread().setName("Avnish");
System.out.println("this run method  by executed "+Thread.currentThread().getName());//Thread-Avnish
}

public static void main(String[] args)
{
System.out.println("this main thread by executed "+Thread.currentThread().getName());//Thread main
Test t1=new Test();
t1.start();
Test t2=new Test();
t2.start();
System.out.println(t1.isAlive());
}
}