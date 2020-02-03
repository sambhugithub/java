import java.awt.*;
import java.applet.Applet;
public class AppletParam extends Applet
{
	/*<Applet 
	code="AppletParam"
	height=400
	width=300>
	<param
	name="sam"
	value="sambhu mandal">
	</Param>
	</Applet>*/
	private String s="sambhu";
	public void paint(Graphics g)
	{
		String s1=getParameter("sam");
		if(s1==null)
			s1=s;
		g.drawString(s1,120,190);
		
	}
}