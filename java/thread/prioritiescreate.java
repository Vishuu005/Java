//NATURE:-1.priorities are inherited from parent thread. 
//2.By default main thread priorities is 5
//3.priorities depands all platform (window does not suport priorities.

class Priorities extends Thread
{
public void  run()
{

System.out.println("child thread");
System.out.println("run thread priorities :"+Thread.currentThread().getPriority());
}
public static void main(String[] args)
{
System.out.println("main thread of old priorites :  "+Thread.currentThread().getPriority());
Thread.currentThread().setPriority(10);
System.out.println("main thread of new priorites :  "+Thread.currentThread().getPriority());
Priorities p=new Priorities();
p.setPriority(6);
p.start();
}
}