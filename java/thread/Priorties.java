class Priorities extends Thread
{
public void  run()
{

System.out.println("child thread");
System.out.println("run thread priorities :"+Thread.currentThread().getPriority());
}
public static void main(String[] args)
{
System.out.println("main thread priorites :  "+Thread.currentThread().getPriority());
Priorities p=new Priorities();
p.start();
}
}