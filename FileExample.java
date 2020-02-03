import java.io.File;
import java.io.IOException;
//import java.io.*;
public class FileExample
{
	public static void main(String [] args) throws IOException
	{
		File f1=new File("d:/exe_file/java/java_programs/file.txt");
		f1.createNewFile();
		System.out.println("can write or not:"+f1.canWrite());
		System.out.println("exists or not:"+f1.exists());
		System.out.println("name:"+f1.getName());
		System.out.println("length:"+f1.length());
		f1.delete();
		
	}
	
}