public class Stringmethod
{
  public static void main(String [] args)
  {
    String s1=new String("computer");
	System.out.println(s1);
	s1=s1.toUpperCase();
	System.out.println(s1);
	s1=s1.toLowerCase();
	System.out.println(s1);
	int i=s1.indexOf('m');
	System.out.println(i);
	i=s1.indexOf('t',4);
	System.out.println(i);
	i=s1.indexOf("puter");
	System.out.println(i);
	i=s1.indexOf("ter",2);
	System.out.println(i);
	i=s1.lastIndexOf('m');
	System.out.println(i);
	i=s1.lastIndexOf('p',6);
	System.out.println(i);
	i=s1.lastIndexOf("omp",0);
	System.out.println(i);
	i=s1.lastIndexOf("pu");
	System.out.println(i);
	String s2=new String("Computer");
	if(s1.equals(s2))
		System.out.println("Strings are equal");
	else
		System.out.println("Strings are not equal");
	if(s1.equalsIgnoreCase(s2))
		System.out.println("equal");
	else
		System.out.println("not equal");
	 i=s1.compareTo(s2);
	System.out.println(i);
	
	
  }
}  