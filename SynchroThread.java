import java.util.Scanner;
class Account
{
  int bal;
  public Account(int bal)
  {
    this.bal=bal;
   }
  public boolean issufficient(int withd)
 {
   if(bal>withd)
     return(true);
   else
     return(false);
	 
 }
  public void withdraw(int withd)
  {
    bal=bal-withd;
    System.out.println("current balance is "+bal);
  }
}
class Customer implements Runnable
{
	private String name;
	int amount;
	Account account;
	public Customer(String n,Account account)
    {
		 this.name=n;
		 this.account=account;
	}	 
	public void run()
    {	
	Scanner sc=new Scanner(System.in);
	synchronized(account)
	{
	System.out.println(name +" "+"enter withdraw amount");
	amount=sc.nextInt();
	if(account.issufficient(amount))
	{
		System.out.println(name);
		account.withdraw(amount);
	}	
	else 
		System.out.println("insufficient balance");
	}
	}
}	
public class SynchroThread
{
	 public static void main(String [] args)
	 {
		  Account a1=new Account(1000);
		  Customer c1=new Customer("raj",a1);
		  Customer c2=new Customer("simran",a1);
		  Thread t1=new Thread(c1);
		  Thread t2=new Thread(c2);
		  t1.start();
		  t2.start();
	 }
}	 