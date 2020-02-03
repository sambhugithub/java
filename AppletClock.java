import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<Applet code="AppletClock" height=400 width=300>
</Applet>*/
public class AppletClock extends Applet implements Runnable
{
	Thread t1,t2;
	public void start()
	{
		t1=new Thread(this);
		t1.start();
		
	}
	public void run()
	{
		t2=Thread.currentThread();
		while(t1==t2)
		{
			repaint();
			try
		   {
				t1.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void paint(Graphics g)
	{
		Calendar cal=new GregorianCalendar();
		String hour=String.valueOf(cal.get(Calendar.HOUR));
		String min=String.valueOf(cal.get(Calendar.MINUTE));
		String sec=String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour+":"+min+":"+sec,130,190);


		
	}
	
}