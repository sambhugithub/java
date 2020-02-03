import java.util.Scanner;
class A
{
  int a1,a2,a3;
  A(int x,int y)
  {
    a1=x;
	a2=y;
	}
	int add()
	{
	   a3=a1+a2;
	   return a3;
	 }
   void display()
   {
     System.out.println("addition result="+a3);
	}
}
class Constractor
{
  	public static void main(String arg[])
	{
	   int n1,n2;
	   Scanner obj=new Scanner(System.in);
	   System.out.println("enter two numbers for addition");
	   n1=obj.nextInt();
	   n2=obj.nextInt();
	   A obj1=new A(n1,n2);
	   obj1.add();
	   obj1.display();
	 }
}	 
	