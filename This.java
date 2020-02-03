class Car
{
  int x;
  public void get_data(int a)
  {
    x=a;
	System.out.println("value of x:"+x);
  }
}
class Sportcar extends Car
{
  int x,y;
  public void get_value(int b)
  {
    this.x=b;
	System.out.println("value of x:"+x);
  }
  public void get_data(int a)
  {
super.get_data(15);
y=super.x;
System.out.println("value of y:"+y);

  }
}
public class This
{
  public static void main(String [] args)
  {
    
	
    Sportcar obj=new Sportcar();
	obj.get_value(5);
	obj.get_data(10);
  }
}  
	
      
    