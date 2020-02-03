import java.util.Scanner;
public class Array1
{
  public static void main(String [] args)
  {
    int n;
    System.out.println("enter the length of array");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
    int arr[]=new int[n];
	System.out.println("enter "+n +"elements for array");
	for(int i=0;i<n;i++)
	  arr[i]=obj.nextInt();
	System.out.println("Array elements are:");
    for(int i=0;i<n;i++)
      System.out.println(arr[i]);
	}
}	