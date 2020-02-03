import java.util.Scanner; 
abstract class Account
{
  
  abstract void interest(int amount,int year,float rate);
}
class B extends Account
{
  int a,y;
  float r,i;
  void interest(int amount,int year,float rate)
  {
     a=amount;
	 y=year;
	 r=rate;
	 i=(a*y*r)/100;
  }
  void disp()
  {
    System.out.println("total interest="+i);
	}
}
public class Abstract
{
  public static void main(String [] args)
  {
     int am,ye;
	 float ra;
     Scanner obj=new Scanner(System.in);
	 System.out.println("enter total ammount,year and rate of interest");
	 am=obj.nextInt();
	 ye=obj.nextInt();
	 ra=obj.nextFloat();
	 B obj1=new B();
	 obj1.interest(am,ye,ra);
	 obj1.disp();
  }
}  
     	 
  
  
  
  
  
	