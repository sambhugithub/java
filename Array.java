import java.lang.*;
import java.util.Scanner;
class A
{
  Scanner obj=new Scanner(System.in);
  int n;
  void getdata(int x)
  {
     n=x;
   }
   int array[]=new int[n];
  void get_arrayelement()
  {
    int i;
    System.out.println("enter"+n+"elements");
    for(i=0;i<n;i++)
    {
	  array[i]=obj.nextInt();
	  System.out.println(+i+"element is"+array[i]);
	  
	}
	 
    
   }
   int total()
   {
	   int i,sum=0;
	   for(i=0;i<n;i++)
	   {
         sum=sum+array[i];
	   }
       return sum;
   }	   
}
class Array
{
  public static void main(String arg[])
  {  
  int a,b;
  Scanner obj1=new Scanner(System.in);
  System.out.println("enter no of element in array");
  a=obj1.nextInt();
  A obj2=new A();
  obj2.getdata(a);
  obj2.get_arrayelement();
  b=obj2.total();
  System.out.println("total of array elements is:"+b);
  }
}  