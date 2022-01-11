 class Thread1 implements Runnable
{
//InterruptedException//error
public void run()
{
System.out.println("name :"+Thread.currentThread().getName());
try{
Thread.sleep(2000);
System.out.println("id:"+Thread.currentThread().getId());
Thread.sleep(1000);
System.out.println("priority:"+Thread.currentThread().getPriority());
}
catch(InterruptedException i)
{
i.printStackTrace();
}
}
public static void main(String[] args)
{
Thread1 obj=new Thread1();
obj.run();
}
}