import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SamCalc extends JFrame
{ 
    JTextField t1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bm,bmu,bd,bpo,be;
	JPanel p;
    public SamCalc()
	{
	}
	public SamCalc(String s)
	{
		super(s);
	}
	public void setComponents()
	{
		t1=new JTextField();
		t1.setEditable(false);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bp=new JButton("+");
		bm=new JButton("-");
		bmu=new JButton("*");
		bd=new JButton("/");
		bpo=new JButton(".");
		be=new JButton("=");
	    p=new JPanel();
		p.setBackground(Color.blue);
		
		setLayout(null);
		t1.setBounds(1,20,498,180);
		b1.setBounds(25,249,100,100);
		b2.setBounds(135,249,100,100);
		b3.setBounds(245,249,100,100);
		bp.setBounds(355,249,100,100);
		b4.setBounds(25,359,100,100);
		b5.setBounds(135,359,100,100);
		b6.setBounds(245,359,100,100);
		bm.setBounds(355,359,100,100);
		
		b7.setBounds(25,469,100,100);
		b8.setBounds(135,469,100,100);
		b9.setBounds(245,469,100,100);
		bmu.setBounds(355,469,100,100);
		
		b0.setBounds(25,579,100,100);
		bpo.setBounds(135,579,100,100);
		be.setBounds(245,579,100,100);
		bd.setBounds(355,579,100,100);
		
		b1.addActionListener(new One());
		
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bp);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bmu);
		p.add(b0);
		p.add(bpo);
		p.add(be);
		p.add(bd);
		p.add(p);
		
		
	}
	public static void main(String [] args)
	{
		SamCalc sm=new SamCalc("sam_calc");
		sm.setComponents();
		
		sm.setVisible(true);
		sm.setSize(500,750);
		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	class One implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("1");
		}
	}
}