package Fahrenheit;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FahrenheitGUI {

	private int width = 300;
	private int height = 75;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fah;
	
	public FahrenheitGUI()
	{
		// create the frame
		frame = new JFrame("Temperature Conversion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inputLabel = new JLabel("Enter Fahrenheit Temperature: ");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		
		fah = new JTextField(5);
		fah.addActionListener(new TempListener());
		
		// create the panel
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(width, height));
		panel.setBackground(Color.yellow);
		
		// add components
		panel.add(inputLabel);
		panel.add(fah);
		panel.add(outputLabel);
		panel.add(resultLabel);
		
		frame.getContentPane().add(panel);
		
	}
	
	@SuppressWarnings("deprecation")
	public void display()
	{
		frame.pack();
		frame.show();
	}
	
	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int fahTemp, celTemp;
			
			String text = fah.getText();
			
			fahTemp = Integer.parseInt(text);
			celTemp = (fahTemp - 32) * 5 / 9;
			
			resultLabel.setText(Integer.toString(celTemp));
		}
	}
}
