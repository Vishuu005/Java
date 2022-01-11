//create two thread block-wize
class Test extends Thread
{
public void run()
{
System.out.println("this run method  by executed "+Thread.currentThread().getName());//Thread-0
}
//Thread name =[Thread-0]

public static void main(String[] args)
{
Test t1=new Test();
System.out.println("this main thread by executed "+Thread.currentThread().getName());//Thread main
t1.start();//this is thread method name(thread-0)
Test t2=new Test();
t2.start();//(thread-1)
//Thread name=[Thread main]
}
}