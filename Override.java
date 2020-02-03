class A
{
   int a,b;
   void ride(int x,int y)
   {
     a=x;
	 b=y;
	 System.out.println("a="+x);
	 System.out.println("b="+y);
   }
}
class B extends A
{
  void ride(int x,int y)
  {
	a=x;
	b=y;
    int c;
    c=a+b;
    System.out.println("result="+c);
   }
}
public class Override
{
  public static void main(String [] args)
  {
	/*A obj1=new A();
	obj1.ride(4,6);**/
    B obj=new B();
    obj.ride(2,3);
	}
}	