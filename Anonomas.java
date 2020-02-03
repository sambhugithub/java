class A
{
	public void print()
	{
		System.out.println("hello world");
	}
}
class B
{
	A obj=new A()
	{
		public void print()
		{
			System.out.println("sambhu");
		}
	};
}
public class Anonomas
{
	public static void main(String [] args)
	{
		B obj1=new B();
		obj1.obj.print();
	}
}