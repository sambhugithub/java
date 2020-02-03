interface X
{
  public void add(int x,int y);
}
interface Y
{
  public void mul(int x,int y);
}
interface Z extends X,Y
{
  public  void div(int x,int y);
}
class A implements Z
{
  public void add(int x,int y)
  {
    int a=x+y;
    System.out.println("addition="+a);
  }
  public void mul(int x,int y)
  {
     int m=x*y;
	 System.out.println("multiplication="+m);
	}
  public void div(int x,int y)
  {
    int d;
	d=x/y;
	System.out.println("division="+d);
  }
}
public class Interface
{
  public static void main(String[] args)
  {
  
  A obj=new A();
  obj.add(2,3);
  /*  
  X obj1=new B();
  obj1.add(2,3);
  */
  obj.mul(2,3);
  obj.div(10,2);
  /*Y obj2=new B();
    obj2.mul(2,3);
  */
  /*Z obj3=new B();
    obj3.div(10,2);
  */
  }
}  