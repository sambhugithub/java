class A extends Thread
{
 public void run()
 {
  int i;
  for(i=0;i<=10;i++)
    System.out.println("A"+"  "+i);
	
 }
}
class B extends Thread
{
  public void run()
  {
    int i;
	for(i=0;i<=10;i++)
	  System.out.println("B"+"  "+i);
	  
  }
  
} 
public class ThreadClass
{  
  public static void main(String [] args)
  {
   A obj=new A();
   B obj1=new B();
   obj.start();
   obj1.start();
   
  }
}