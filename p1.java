class MyThread implements Runnable
{
	Thread thrd;
	int time;
	MyThread(String name,int t)
	{
		thrd =new Thread(this,name);
		time=t*100;
		thrd.start();
		
	}
	public void run()
	{
		System.out.println(thrd.getName()+"stsrting......");
		try
		{
			for(int count=0;count<(60/(time/100));count++)
			{
				Thread.sleep(time);
				System.out.println(thrd.getName());
				
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(thrd.getName()+"interrupted....");
		}
		System.out.println(thrd.getName()+"terinating.....");
	}
}
public class p1
{
	public static void main(String[] args)
	{
		MyThread mt1=new MyThread("Good Morning",1);
		MyThread mt2=new MyThread("Hello",2);
		MyThread mt3=new MyThread("Welcome",3);
		try
		{
			mt1.thrd.join();
			System.out.println("Good morning #1 Joined");
			mt2.thrd.join();
			System.out.println("Hello #2 Joined");
			mt3.thrd.join();
			System.out.println("Welcome #3 Joined");
		}
		catch(InterruptedException e)
		{
			System.out.println("main Thread Interrupted");
			
		}
		System.out.println("main Thread Ending");
		
	}
}
