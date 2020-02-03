import java.util.Scanner;//taking input from user
import java.io.File;//for create object of File class
import java.io.FileOutputStream;//to write on file
import java.io.FileInputStream;//to read from file to buffer
import java.io.IOException;//checked exception handle
//import java.io.*;instead of above all import file
public class FileHandle
{
	public static void main(String [] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("d:/exe_file/java/java_programs/first_file.txt",true);
		String s;
		System.out.println("enter lines for file");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char array[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(array[i]);
		fout.close();
		File f1=new File("d:/exe_file/java/java_programs/first_file.txt");
		System.out.println("writeable?"+f1.canWrite());
		System.out.println("isexists?"+f1.exists());
		System.out.println("length:"+f1.length());
		System.out.println("name:"+f1.getName());
		FileInputStream fin=new FileInputStream("d:/exe_file/java/java_programs/first_file.txt");
	    FileOutputStream fout1=new FileOutputStream("d:/exe_file/java/java_programs/second_file.txt",true);
		char array1[]=new char[1000];
		int j,k=0;
		do
		{
			j=fin.read();
			array1[k]=(char)j;
			k++;
		}while(j!=-1);
        for(k=0;k<1000;k++)
          fout1.write(array1[k]);
	  for(int l=0;l!=1000;l++)
		  System.out.print(array1[l]);
	    fout1.close();
		/*File f2=new File("d:/exe_file/java/java_programs/second_file.txt");
		f2.delete();*/
		
	  
	}
}	
		
			
			
		

	