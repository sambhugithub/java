import java.util.Scanner;
class A
{
  int m1,m2;
  void getdata(int x,int y)
  {
     m1=x;
	 m2=y;
	}
  int add()
  {
    int c=(m1+m2);
    return c;
   }
}
class B extends A
{
	int c;
      void getdata(int x,int y)
  {
     m1=x;
	 m2=y;
	}
  int add()
  {
     c=(m1+m2);
    return c;
	
   }
   void disp()
   {
	   System.out.println("addition result="+c);
   }
   
}
class Inharit
{
   public static void main(String arg[])
   {
     int a1,a2;
     Scanner obj=new Scanner(System.in);
     System.out.println("enter two numbers for addition\n");
     a1=obj.nextInt();
     a2=obj.nextInt();
     B obj1=new B();
     obj1.getdata(a1,a2);
     obj1.add();
	 obj1.disp();
    }
}	