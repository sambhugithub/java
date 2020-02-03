import java.util.Scanner;
class A
{
  int a,b,c;
  static int r;
  void get_details(int x,int y,int z)
  {
    a=x;
	b=y;
	c=z;
  }
 void interest(int i)
  {
    float d;
	d=(float)(b*c*i)/100;
	System.out.println("Acc no:"+a+"interest:"+d);
  }
 
}
class Static
{
  public static void main(String arg[])
  { 
    int a,b,c;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter account no,balance amount and year:");
	a=obj.nextInt();
	b=obj.nextInt();
	c=obj.nextInt();
	System.out.println("enter rate of interest:");
	A.r=obj.nextInt();
	A obj1=new A();
	obj1.get_details(a,b,c);
	obj1.interest(A.r);
	
	
	}
}	
      
	
      
  