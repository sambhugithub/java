import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SwingSum extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1;
	
	public SwingSum()
	{
	}
	public SwingSum(String s)
	{
		super(s);
	}
	public void setComponents()
	{
		l1=new JLabel("Addition Of Two Numbers");
		l2=new JLabel("First Number");
		l3=new JLabel("Second Number");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("Add");
		l4=new JLabel();
		setLayout(null);
		l1.setBounds(150,50,300,40);
		l2.setBounds(20,150,50,30);
		l3.setBounds(20,200,50,30);
		t1.setBounds(100,150,50,30);
		t2.setBounds(100,200,50,30);
		b1.setBounds(200,250,30,30);
		l4.setBounds(200,300,50,30);
		b1.addActionListener(new Action());
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(b1);
		add(l4);
		
		
		
		
	}
	public static void main(String [] args)
	{
		SwingSum sw=new SwingSum("Addition");
		sw.setComponents();
		sw.setVisible(true);
		sw.setSize(400,400);
		sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int p=a+b;
			l4.setText("result "+p);
			
		}
	}
}
