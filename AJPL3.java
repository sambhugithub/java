import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class TLFrame extends JFrame implements ItemListener {
	public JLabel label1, label2;
	public JRadioButton r1, r2, r3;
	public ButtonGroup bg;
	public JPanel panel1, panel2;
	public TLFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		setSize(400, 400);
		panel1 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new FlowLayout());
		
		label1 = new JLabel();
		
		Font f = new Font("Verdana", Font.BOLD, 60);
		label1.setFont(f);
		panel1.add(label1);
		add(panel1);
		
		label2 = new JLabel("Select Lights");
		panel2.add(label2);
		JRadioButton r1 = new JRadioButton("Red Light");
		r1.setBackground(Color.red);
		panel2.add(r1);
		r1.addItemListener(this);
		
		JRadioButton r2 = new JRadioButton("Yellow Light");
		r2.setBackground(Color.YELLOW);
		panel2.add(r2);
		r2.addItemListener(this);
		
		JRadioButton r3 = new JRadioButton("Green Light");
		r3.setBackground(Color.GREEN);
		panel2.add(r3);
		r3.addItemListener(this);
		
		add(panel2);
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent i) {
		JRadioButton jb = (JRadioButton) i.getSource();
		switch (jb.getText()) {
			case "Red Light": {
				label1.setText("STOP");
				label1.setForeground(Color.red);
			}
			break;
			case "Yellow Light": {
				label1.setText("Ready");
				label1.setForeground(Color.YELLOW);
			}
			break;
			case "Green Light": {
				label1.setText("GO");
				label1.setForeground(Color.GREEN);
			}
			break;
		}
	}
}

public class AJPL3 {
		public static void main(String[] args) {
			TLFrame TLobj = new TLFrame();
	}
}