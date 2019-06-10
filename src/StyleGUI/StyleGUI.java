package StyleGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleGUI {

	private final int WIDTH = 250, HEIGHT = 150, FONT_SIZE = 36;

	private JLabel saying;
	private JCheckBox bold, italic;
	private JPanel main;

	public StyleGUI()
	{
		saying = new JLabel("I like puppies!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, FONT_SIZE));

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);

		StyleListener listener =  new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);

		main = new JPanel();
		main.setBackground(Color.cyan);
		main.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		main.add(saying);
		main.add(bold);
		main.add(italic);

	}

	public JPanel getPanel()
	{
		return main;
	}

	public class StyleListener implements ItemListener
	{
		public void itemStateChanged (ItemEvent event)
		{
			int style = Font.PLAIN;

			if (bold.isSelected())
				style = Font.BOLD;
			
			if (italic.isSelected())
				style += Font.ITALIC;
			
			saying.setFont(new Font("Helvetica", style, FONT_SIZE));
			
			
			
		}
	}


}
