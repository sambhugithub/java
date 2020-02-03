import java.awt.*;
import java.applet.Applet;
/*<applet code="MyApplet"width=400 height=400>
</applet*/
public class MyApplet extends Applet 
{
	public void paint(Graphics g)
	{
		int a=1;
		int b=29;
		int c=a+b;
		String s="sum="+String.valueOf(c);
		g.drawString(s,100,100);
		
	}
	
}