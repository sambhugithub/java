import java.util.Scanner;
class ExceptionEx
{
  public static void main(String[] args)
  {
    int bal;
	int withd;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter current balance and withdrawl amount");
	bal=sc.nextInt();
	withd=sc.nextInt();
	try
	{
	  if(withd>bal)
	    throw new ArithmeticException("insufficient balance");
	  bal=bal-withd;
      System.out.println("current balance:"+bal);
    }
    catch(ArithmeticException e)
    {
	  System.out.println("Exception:"+e.getMessage());
	  System.out.println("you should enter the withdrawl amount as less than or equal to current balance" );
	  
    }
    finally
    {
	  System.out.println("if you have done transection successfully then collect your cash and card else try again");
	  
    }
  }
}  
	