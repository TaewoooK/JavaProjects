package ChipEater;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class ChipEater extends Applet implements ActionListener, ItemListener{

	private final int apWidth = 320;
	private final int apHeight = 320;
	private final int min = 20;

	private Image doritos;
	private Checkbox doritosBox;
	private Image lays;
	private Checkbox laysBox;
	private Image veggie;
	private Checkbox veggieBox;
	private Image joyel;

	private Image dChip;
	private Image lChip;
	private Image vStick;

	private Button eat;
	private Button close;
	private Image joyelEat;

	private Font good;

	private Image temp;

	private Button goChip;

	private Image chipLabel;
	private Image selChip;
	private Image border;

	String chip = "";
	CheckboxGroup checkGroup = new CheckboxGroup();
	int Jwidth = 70;

	boolean dChipShow;
	boolean lChipShow;
	boolean vStickShow;

	boolean white;

	int chipLocX = 200;
	int chipLocY = 225;

	public void init()
	{ 
		dChipShow = false;
		lChipShow = false;
		vStickShow = false;

		white = true;
//hi
		this.setSize(new Dimension(650, 450));

		good = new Font("Elephant", Font.BOLD, 18);

		chipLabel = getImage(getDocumentBase(), "Chips Label.png");
		selChip = getImage(getDocumentBase(), "Select Chip.png");
		border = getImage(getDocumentBase(), "Border.png");

		eat = new Button();
		eat.setLabel("Open!");
		eat.addActionListener(this);
		add(eat);

		close = new Button();
		close.setLabel("Close!");
		close.addActionListener(this);
		add(close);

		goChip = new Button();
		goChip.setLabel("-->");
		goChip.addActionListener(this);
		add(goChip);

		joyel = getImage(getDocumentBase(), "joyel.png");
		joyelEat = getImage(getDocumentBase(), "joyelOpen.png");

		temp = joyel;

		dChip = getImage(getDocumentBase(), "dChip.png");
		lChip = getImage(getDocumentBase(), "lChip.PNG");
		vStick = getImage(getDocumentBase(), "vStick.png");

		doritos = getImage(getDocumentBase(), "doritos.png");
		doritosBox = new Checkbox("Doritos", checkGroup, false);
		add(doritosBox);		
		doritosBox.addItemListener(this);

		lays = getImage(getDocumentBase(), "lays.png");
		laysBox = new Checkbox("Lays", checkGroup, false);
		add(laysBox);
		laysBox.addItemListener(this);

		veggie = getImage(getDocumentBase(), "veggie.png");
		veggieBox = new Checkbox("Veggie Straws", checkGroup, false);
		add(veggieBox);
		veggieBox.addItemListener(this);

	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == eat)
		{	
			joyel = joyelEat;
			repaint();
		}

		if(e.getSource() == close)
		{
			joyel = temp;

			if(checkGroup.getSelectedCheckbox() == doritosBox)
			{
				chipLocX = 200; 
				dChipShow = false;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == laysBox)
			{
				chipLocX = 200; 
				lChipShow = false;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == veggieBox)
			{
				chipLocX = 200; 
				vStickShow = false;
				repaint();
			}

			repaint();
		}

		if(e.getSource() == goChip)
		{
			if(joyel == joyelEat)
			{
				if(checkGroup.getSelectedCheckbox() == doritosBox)
				{
					chipLocX = 280; 
					repaint();
				}

				if(checkGroup.getSelectedCheckbox() == laysBox)
				{
					chipLocX = 270; 
					repaint();
				}

				if(checkGroup.getSelectedCheckbox() == veggieBox)
				{
					chipLocX = 260; 
					repaint();
				}
			}
		}
	}

	public void itemStateChanged(ItemEvent arg0) 
	{
		if(checkGroup.getSelectedCheckbox() == doritosBox)
		{
			if(chipLocX != 200)
				chipLocX = 200;
			chip = "Doritos";
			dChipShow = true;
			lChipShow = false;
			vStickShow = false;
			repaint();
		}

		if(checkGroup.getSelectedCheckbox() == laysBox)
		{
			if(chipLocX != 200)
				chipLocX = 200;
			chip = "Lays";
			lChipShow = true;
			dChipShow = false;
			vStickShow = false;
			repaint();
		}

		if(checkGroup.getSelectedCheckbox() == veggieBox)
		{
			if(chipLocX != 200)
				chipLocX = 200;
			chip = "Veggie Straws";
			vStickShow = true;
			dChipShow = false;
			lChipShow = false;
			repaint();
		}
	}

	public void paint(Graphics g) {  

		g.drawImage(border, -20, -20, this);

		g.setFont(good);
		g.drawString(chip, 380, 50);

		g.drawImage(chipLabel, 0, 0, this);
		g.drawImage(selChip, 55, 0, this);

		eat.setSize(60, 60);
		eat.setFont(good);
		eat.setLocation(450, 70);

		close.setSize(60, 60);
		close.setFont(good);
		close.setLocation(510, 70);

		goChip.setSize(75, 50);
		goChip.setFont(good);
		goChip.setLocation(200, 150);

		g.setColor(Color.blue);
		g.fillOval(300, 215, Jwidth, 200); 
		g.drawImage(joyel, 269, 100, this);

		g.drawImage(doritos, 75, 70, this);  
		doritosBox.setLocation(72, 140);

		g.drawImage(lays, 62, 170, this);  
		laysBox.setLocation(77, 240);

		g.drawImage(veggie, 72, 270, this);  
		veggieBox.setLocation(60, 350);

		if(dChipShow == true)
		{
			g.drawImage(dChip, chipLocX, chipLocY, this);
			white = false;
		}
		else if(lChipShow == true)
		{
			g.drawImage(lChip, chipLocX, chipLocY, this);
			white = false;
		}
		else if(vStickShow == true)
		{
			g.drawImage(vStick, chipLocX, chipLocY, this);
			white = false;
		}
		else
		{
			g.setColor(Color.white);
			g.fillOval(200, 225, 50, 50);
		}
	}  
}
