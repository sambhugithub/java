import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<Applet code="Component" height=400 width=400></Applet>*/
public class EventHandling extends Applet
{
	Label l1,l2,r;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		 l1=new Label("Enter first number");
		 l2=new Label("Enter second number");
		 r=new Label();
		 t1=new TextField();
		 t2=new TextField();
		 b1=new Button("Add");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		r.setBounds(100,200,100,20);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(b1);
		add(r);
		b1.addActionListener(new Add());
		
	}
	public class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			r.setText("sum="+c);
		}
	}
}