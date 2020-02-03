import java.lang.*;
import java.util.Scanner;
class CmndLineArgs
{
  public static void main(String [] args)
  {
    int s=0,n;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter no of elements in array:");
	n=obj.nextInt();
    String array[]=new String[n];
	System.out.println("enter"+n+"integers");
	for(int i=0;i<n;i++)
	{
	  array[i]=obj.nextLine();
	  args[i]=array[i];
	  s=s+Integer.parseInt(args[i]);
	}
    System.out.println("total="+s);
	
	}
}	
	  
	  
	
    