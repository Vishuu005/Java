class Test extends Thread
{
public void run()
{
System.out.println("this run method  by executed "+Thread.currentThread().getName());//Thread-0
}

public static void main(String[] args)
{
System.out.println("this main thread by executed "+Thread.currentThread().getName());//Thread main
Test t1=new Test();
//create thread name1
t1.setName("Avnish");
t1.start();
Test t2=new Test();
//create thread name2
t2.setName("yadav");
t2.start();

}
}