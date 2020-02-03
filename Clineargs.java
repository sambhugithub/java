import java.util.Scanner;
class CmndLineArgs
{
  public static void main(String [] args)
  {
    int s=0;
    Scanner obj=new Scanner(System.in);
    String array[]=new String[array.length];
	System.out.println("enter"+array.length+"integers");
	for(int i=0;i<array.length;i++)
	{
	  array[i]=obj.nextLine();
	  args[i]=array[i];
	  s=s+Integer.parseInt(args[i]);
	}
    System.out.println("total="+s);
	
	}
}	
	  
	  
	
    