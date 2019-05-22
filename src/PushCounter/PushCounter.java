package PushCounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounter extends JApplet{

	private int Ap_Width = 300;
	private int Ap_Height = 35;
	private int pushes;
	
	private JLabel label;
	private JButton push;
	
	// Set up the GUI
	public void init()
	{
		pushes = 0;
		push = new JButton("Push me!");
		push.addActionListener(new ButtonListener());
		
		label = new JLabel("Pushes: " + Integer.toString(pushes));
		
		Container cp = getContentPane();
		cp.setBackground(Color.cyan);
		cp.setLayout(new FlowLayout());
		cp.add(push);
		cp.add(label);
		
		setSize(Ap_Width, Ap_Height);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			pushes++;
			label.setText("Pushes: " + Integer.toString(pushes));
			repaint();
		}
	}
	
}
