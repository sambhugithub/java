class Dummy
{
    final int x;
  {
    x=10;
	System.out.println("value of x:"+x);
  }
}
 class FinalEx
{
   public static void main(String [] args)
   {
     Dummy obj=new Dummy();
     System.out.println("value of x:"+obj.x);
     Dummy obj1=new Dummy();
     System.out.println("value of x:"+obj1.x);	 
   }
}   