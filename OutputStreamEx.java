import java.util.Scanner; 
import java.io.*;
import java.io.FileOutputStream;
public class OutputStreamEx
{
	public static void main(String [] args ) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("d:/exe_file/java/java_programs/output.txt",true);
		String s;
		System.out.println("enter the line for file");
		s=sc.nextLine();
		char arry[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(arry[i]);
		fout.close();
		File f1=new File("d:/exe_file/java/java_programs/output.txt");
		f1.delete();
		
		
	}
}