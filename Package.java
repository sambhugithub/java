package Practice;
import java.util.Scanner;
class Package
{
  public static void main(String [] args)
  {
    int a,b,c;
    Scanner obj=new Scanner(System.in);
	System.out.println("enter two integers");
	a=obj.nextInt();
	b=obj.nextInt();
	c=a+b;
	System.out.println("addition is:"+c);
  }
}
  