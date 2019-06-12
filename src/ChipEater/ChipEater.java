package ChipEater;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.applet.*;


public class ChipEater extends Applet implements ActionListener, ItemListener{

	private static final long serialVersionUID = 1L;

	private Image doritos;
	private Checkbox doritosBox;
	private Image dChip;
	private Image lays;
	private Checkbox laysBox;
	private Image lChip;
	private Image veggie;
	private Checkbox veggieBox;
	private Image vStick;
	private Image joyel;
	
	private Image flamHot;
	private Image flamChip;
	private Image sun;
	private Image sunChip;
	private Image baked;
	private Image bakedChip;

	private Button eat;
	private Button close;
	private Image joyelEat;

	private Font good;

	private Image temp;

	private Button goChip;
	private Button shop;

	private Image chipLabel;
	private Image selChip;
	private Image border;

	private Label mlabel;
	String chip = "";
	String max = "";

	CheckboxGroup checkGroup = new CheckboxGroup();
	int Jwidth = 70;

	boolean dChipShow;
	boolean lChipShow;
	boolean vStickShow;

	boolean white;

	int chipLocX = 200;
	int chipLocY = 210;

	Image[] fat = new Image[7];
	int i = 0;

	double chip1 = 3;
	double chip2 = 3;
	double chip3 = 1;

	int money = 500;
	int reply = 0;
	int upgrade = 0;
	double funds = 50;
	
	String newChip1 = "Doritos";
	String newChip2 = "Lays";
	String newChip3 = "Veggie Straws";

	public void init()
	{ 
		fat[0] = getImage(getDocumentBase(), "B1.png");
		fat[1] = getImage(getDocumentBase(), "B2.png");
		fat[2] = getImage(getDocumentBase(), "B3.png");
		fat[3] = getImage(getDocumentBase(), "B4.png");
		fat[4] = getImage(getDocumentBase(), "B5.png");
		fat[5] = getImage(getDocumentBase(), "B6.png");
		fat[6] = getImage(getDocumentBase(), "B7.png");

		dChipShow = false;
		lChipShow = false;
		vStickShow = false;

		white = true;

		this.setSize(new Dimension(650, 450));

		good = new Font("Elephant", Font.BOLD, 18);

		chipLabel = getImage(getDocumentBase(), "Chips Label.png");
		selChip = getImage(getDocumentBase(), "Select Chip.png");
		border = getImage(getDocumentBase(), "Border.png");

		eat = new Button();
		eat.setLabel("Open");
		eat.addActionListener(this);
		add(eat);

		close = new Button();
		close.setLabel("Close");
		close.addActionListener(this);
		add(close);

		goChip = new Button();
		goChip.setLabel("------>");
		goChip.addActionListener(this);
		add(goChip);

		shop = new Button();
		shop.setLabel("UPGRADE");
		shop.addActionListener(this);
		add(shop);

		joyel = getImage(getDocumentBase(), "joyel.png");
		joyelEat = getImage(getDocumentBase(), "joyelOpen.png");

		temp = joyel;

		dChip = getImage(getDocumentBase(), "dChip.png");
		lChip = getImage(getDocumentBase(), "lChip.PNG");
		vStick = getImage(getDocumentBase(), "vStick.png");

		doritos = getImage(getDocumentBase(), "doritos.png");
		doritosBox = new Checkbox("Choice 1", checkGroup, false);
		add(doritosBox);		
		doritosBox.addItemListener(this);

		lays = getImage(getDocumentBase(), "lays.png");
		laysBox = new Checkbox("Choice 2", checkGroup, false);
		add(laysBox);
		laysBox.addItemListener(this);

		veggie = getImage(getDocumentBase(), "veggie.png");
		veggieBox = new Checkbox("Choice 3", checkGroup, false);
		add(veggieBox);
		veggieBox.addItemListener(this);
		
		flamHot = getImage(getDocumentBase(), "flamHot1.png");
		flamChip = getImage(getDocumentBase(), "flamChip.png");
		
		sun = getImage(getDocumentBase(), "sun.png");
		sunChip = getImage(getDocumentBase(), "sunChip.png");
		
		baked = getImage(getDocumentBase(), "baked.png");
		bakedChip = getImage(getDocumentBase(), "bakedChip.png");

		mlabel = new Label("" + money);
		add(mlabel);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == shop)
		{
			if(funds <= money)
			{
				reply = JOptionPane.showConfirmDialog(null, "Do you use $" + funds + " to upgrade?", "Upgrade", JOptionPane.YES_NO_OPTION);

				if (reply == JOptionPane.YES_OPTION) 
				{
					JOptionPane.showMessageDialog(null, "Upgraded");
					upgrade++;
					money -= funds;
					funds *= 1.5;
					if(upgrade == 3)
					{
						chip3 += 1;
						upgrade = 0;
						veggie = baked;
						newChip3 = "Lays Baked";
						vStick = bakedChip;
					}
					else if(upgrade == 2)
					{
						chip2 += 3;
						lays = sun;
						newChip2 = "SunChips";
						lChip = sunChip;
					}
					else
					{
						chip1 += 3;
						doritos = flamHot;
						newChip1 = "Flamming Hot Cheetos";
						dChip = flamChip;
					}
					repaint();
				}

				else 
				{
					JOptionPane.showMessageDialog(null, "We hope to see you again.");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Insufficient Funds. You need " + funds + " to upgrade chips");
			}
		}

		if(e.getSource() == eat)
		{	
			joyel = joyelEat;

			if(checkGroup.getSelectedCheckbox() == doritosBox)
			{
				dChipShow = true;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == laysBox)
			{
				lChipShow = true;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == veggieBox )
			{
				vStickShow = true;
				repaint();
			}

			repaint();
		}

		if(e.getSource() == close)
		{
			joyel = temp;

			if(checkGroup.getSelectedCheckbox() == doritosBox && chipLocX == 380)
			{
				chipLocX = 200; 
				dChipShow = false;
				if(i < 6)
					i++;
				money+=chip1;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == laysBox && chipLocX == 370)
			{
				chipLocX = 200; 
				lChipShow = false;
				if(i < 6)
					i++;
				money+=chip2;
				repaint();
			}

			if(checkGroup.getSelectedCheckbox() == veggieBox && chipLocX == 360)
			{
				chipLocX = 200; 
				vStickShow = false;
				if(i > 0)
					i--;
				money+=chip3;
				repaint();
			}

			repaint();
		}

		if(e.getSource() == goChip)
		{
			if(joyel == joyelEat)
			{
				if(checkGroup.getSelectedCheckbox() == doritosBox && i != 6)
				{
					chipLocX = 380; 
					repaint();
				}

				if(checkGroup.getSelectedCheckbox() == laysBox && i != 6)
				{
					chipLocX = 370; 
					repaint();
				}

				if(checkGroup.getSelectedCheckbox() == veggieBox && i != 0)
				{
					chipLocX = 360; 
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
			chip = newChip1;
			dChipShow = true;
			lChipShow = false;
			vStickShow = false;
			repaint();
		}

		if(checkGroup.getSelectedCheckbox() == laysBox)
		{
			if(chipLocX != 200)
				chipLocX = 200;
			chip = newChip2;
			lChipShow = true;
			dChipShow = false;
			vStickShow = false;
			repaint();
		}

		if(checkGroup.getSelectedCheckbox() == veggieBox)
		{
			if(chipLocX != 200)
				chipLocX = 200;
			chip = newChip3;
			vStickShow = true;
			dChipShow = false;
			lChipShow = false;
			repaint();
		}
	}

	public void paint(Graphics g) 
	{  
		g.drawImage(border, -20, -20, this);

		g.setFont(good);
		g.drawString(chip, 380, 50);

		g.drawImage(chipLabel, 0, 0, this);
		g.drawImage(selChip, 55, 0, this);

		eat.setSize(60, 60);
		eat.setFont(good);
		eat.setLocation(200, 70);

		close.setSize(60, 60);
		close.setFont(good);
		close.setLocation(260, 70);

		goChip.setSize(75, 50);
		goChip.setFont(good);
		goChip.setLocation(200, 150);

		g.drawImage(fat[i], 240, 100, this);
		g.drawImage(joyel, 370, 80, this);

		g.drawImage(doritos, 75, 70, this);  
		doritosBox.setLocation(72, 140);

		g.drawImage(lays, 62, 170, this);  
		laysBox.setLocation(72, 240);

		g.drawImage(veggie, 72, 270, this);  
		veggieBox.setLocation(68, 350);

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

		if(i == 6)
		{
			max = "I am full";
			g.setColor(Color.black);
			g.setFont(good);
			g.drawString(max, 285, 220);
		}

		if(i == 0 && !(vStickShow == true || lChipShow == true || dChipShow == true))
		{
			max = "Feed me junk chips";
			g.setColor(Color.black);
			g.setFont(good);
			g.drawString(max, 190, 220);
		}

		mlabel.setText(String.valueOf(money));
		mlabel.setSize(50, 30);
		mlabel.setFont(good);
		mlabel.setLocation(550, 390);

		shop.setSize(95, 50);
		shop.setFont(good);
		shop.setLocation(56, 385);

	}  

}
