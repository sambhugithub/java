import java.io.*;
public class BufferedRead
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader bf=new BufferedReader(new FileReader("buffer.txt"));
		/*int i;
		while((i=bf.read())!=-1)
			System.out.print((char)i);
		bf.close();*/
	    String s;
		while((s=bf.readLine())!=null)
			System.out.println(s);
		bf.close();
			
	}
}