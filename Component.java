import java.awt.*;
import java.applet.Applet;
/*<Applet code="Component" height=400 width=300></Applet>*/
public class Component extends Applet
{
	public void init()
	{
		Label l1=new Label("Enter first number");
		Label l2=new Label("Enter second number");
		Label l3=new Label();
		TextField t1=new TextField();
		TextField t2=new TextField();
		Button b1=new Button("Add");
		/*FlowLayout f1=new FlowLayout();
		setLayout(f1);*/
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(150,100,100,20);
		b1.setBounds(100,150,80,20);
		l3.setBounds(100,180,100,20);
		add(t1);
		add(t2);
		add(l1);
		add(l2);
		add(b1);
		add(l3);
		
		
		
	}
}