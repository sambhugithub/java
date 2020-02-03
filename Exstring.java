import java.lang.String;
public class Exstring
{
  public static void main(String [] args)
  {
    String s1="sambhu";
	String s2="sambhu";
	String s3=new String("mandal");
	String s4=s1+" "+s3;
	System.out.println(s4);
	System.out.println("string is:"+(s1==s2));
    System.out.println("string is:"+(s1.equals(s2)));
	System.out.println("string is:"+(s1==s3));
    System.out.println("string is:"+(s1.equals(s3)));
}
}  
  