import java.util.Scanner;
class GenericsM
{
	public <E> void printArray(E []s)
	{
		for(E x:s)
			System.out.println(x);
	}
	public static void main(String [] args)
	{
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of cuntries");
		n=sc.nextInt();
		System.out.println("enter the no of numbers");
		m=sc.nextInt();
		String cuntry[]=new String[n];
		Integer number[]=new Integer[m];
		System.out.println("enter "+n+"cuntry name");
		for(i=0;i<n;i++)
			cuntry[i]=sc.nextLine();
		System.out.println("enter "+m+"integers");
		for(j=0;j<m;j++)
			number[i]=sc.nextInt();
		
		Generics obj=new Generics();
		obj.printArray(cuntry);
		obj.printArray(number);
		
	}
}
