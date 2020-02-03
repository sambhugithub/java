class A <T>
{
	T i;
	public void getData(T d)
	{
		i=d;
	}
	public T putData()
	{
		return i;
	}
	
} 
public class GenericsC
{
	public static void main(String [] args)
	{
		A <Integer> obj=new A<Integer>();
		Integer k=new Integer(10);
		A<String> obj1=new A<String>();
		String s="sambhu";
		obj.getData(k);
		obj1.getData(s);
		System.out.println("Integer:"+obj.putData());
		System.out.println("String:"+obj1.putData());
	}
}