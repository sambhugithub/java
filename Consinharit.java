class A
{
  int a,b,c;
  public A(int x,int y)
  {
    a=x;
	b=y;
	c=a+b;
	System.out.println("c="+c);
	
  }
}  
class B extends A
{
  int d;
  public B()
  {
	this(10);
	System.out.println("subclass constractor");
  }
  public B(int x)
  { 
      super(2,3);
	  d=x;
	  System.out.println("d="+d);
  }	  
	  
}
public class Consinharit
{
  public static void main(String [] args)
  {
    B obj=new B();
   }
}   
  