import java.io.*;
public class FileOutputStreamEx
{
	public static void main(String [] args ) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("./File.txt",true);
		String s="SAMBHU";
		char arry[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(arry[i]);
		fout.close();
		
	}
}