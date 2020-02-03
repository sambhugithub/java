import javax.swing.*;
public class Swing2 extends JFrame
{
	public Swing2()
	{
	}
	public Swing2(String s)
	{
		super(s);
	}
	public static void main(String [] args)
	{
		Swing2 sw=new Swing2("Frame");
		sw.setVisible(true);
		sw.setSize(300,300);
		sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}