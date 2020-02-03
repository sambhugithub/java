import java.util.*;
public class ArrayListEx
{
	public static void main(String [] args)
	{
		ArrayList l1=new ArrayList(4);
		l1.add("sambhu");
		l1.add("mandal");
		l1.add(1,"sambhu mandal");
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}