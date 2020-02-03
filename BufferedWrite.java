import java.util.Scanner;
import java.io.*;
public class BufferedWrite 
{
  public static void main(String [] args) throws IOException
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("write something on file:");
	  String s;
	  s=sc.nextLine();
	  FileWriter fw=new FileWriter("./buffer.txt",true);
	  BufferedWriter bf=new BufferedWriter(fw);
	  bf.write(s);
	  bf.close();
  }
}