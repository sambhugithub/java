import java.util.Scanner;
class Twodarray
{
  public static void main(String [] args)
  { int n,m;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter the length of ref variable in array");
	n=obj.nextInt();
    int arr[][]=new int[n][];
	System.out.println(" ---------enter elements in each ref variables------------");
	for(int i=0;i<n;i++)
	{
	  System.out.println("enter no of elements in ref variable"+i);
	  m=obj.nextInt();
	  arr[i]=new int[m];
	  for(int j=0;j<m;j++)
	    arr[i]=new int[j];
	}
    System.out.println("Array elements in each ref variables");
    for(int i=0;i<n;i++)
    { 
	  System.out.println("Elements of Array["+i+"]");
      for(int j=0;j<arr[j].length;j++)
      {
        System.out.println(arr[i][j]);	
       }
    }
  }
}  