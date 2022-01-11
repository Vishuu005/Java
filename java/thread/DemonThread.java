// Daemon thread background me run krta rahta h main thread ke
class Daemon extends Thread
{
public void run()
{
//System.out.println("daemon thread :"+Thread.currentThread().isDaemon());
if(Thread.currentThread().isDaemon())
{
System.out.println("daemon thread");
}
else 
{
System.out.println("child thread2");
}
System.out.println("child thread");
}
public static void main(String[] args)
{
System.out.println("main thread");
Daemon t=new Daemon();
t.setDaemon(true);
t.start();

}
}
//Case1:- we have to create daemon thread before starting the thread,if we create daemon thread after starting it,it will throw run time exception ie. Illigal thread state Exception
