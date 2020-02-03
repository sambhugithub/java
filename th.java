import java.util.*;
class A
{
	public void print()
	{
		int i;
		for(i=1;i<=10;i++)
			System.out.println("A"+" "+i);
		
	}
	
}
class B
{
	public void print1()
	{
		int i;
		for(i=1;i<=10;i++)
			System.out.println("B"+" "+i);
		
	}
	
}
public class th
{
	public static void main(String [] args)
	{
		A a1=new A();
		B b1=new B();
		a1.print();
		b1.print1();
		
	}
}