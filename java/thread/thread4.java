class thread implements Runnable 
{
public void run()
{
//moving thread2 to timed waiting waiting state 
try
{
Thread.sleep(1500);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("State of thread1 while it called join() method on thread2-"+Test.thread1.getState());
try{
Thread.sleep(200);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
}
class Test implements Runnable
{
public static Thread thread1;
public static Test obj;
public static void main(String[] args)
{
obj=new Test();
thread1=new Thread(obj);
}
}
