class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=9;i++)
			System.out.println("Thread A:"+i);
		
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int j=0;j<=9;j++)
			System.out.println("Thread B:"+j);
		
	}
	
}
public class p2
{
	public static void main(String [] args)
	{
		A obj1=new A();
		Thread obj2=new Thread(new B());
		obj1.start();
		obj2.start();
		
	}
}