class A extends Thread
{
	String name;
	int time;
	Thread thrd;
	A(String name,int t)
	{
		this.name=name;
		this.time=t;
		
	}
	public void run()
	{ 
	    for(int count=0;count<10;count++)
		{
		System.out.println(name);
		try
		{
		thrd.sleep(time);
		}
		catch(InterruptedException e)
		{
			System.out.println("thread interrupted");
		}
		}
	}
}
class B extends Thread
{
	String name;
	int time;
	Thread thrd;
	B(String name,int t)
	{
		this.name=name;
		this.time=t;
		
	}
	public void run()
	{
		for(int count=0;count<10;count++)
		{
		System.out.println(name);
		try
		{
		thrd.sleep(time);
		}
		catch(InterruptedException e)
		{
			System.out.println("thread interrupted");
		}
		}
	}
}
class C extends Thread
{
	String name;
	int time;
	Thread thrd;
	C(String name,int t)
	{
		this.name=name;
		this.time=t;
		
	}
	public void run()
	{
		for(int count=0;count<10;count++)
		{
		System.out.println(name);
		try
		{
		thrd.sleep(time);
		}
		catch(InterruptedException e)
		{
			System.out.println("thread interrupted");
		}
		}
	}
}
public class Threadp
{
	public static void main(String [] args)
	{
		A obj1=new A("Good Morning",100);
		A obj2=new A("Hello",200);
		A obj3=new A("WelCome",300);
		obj1.start();
		obj2.start();
		obj3.start();
		
	}
}