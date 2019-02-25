package PetTester;

public class Cat extends Pet {
	
	private String Color;
	
	public Cat(String Name, String Color)
	{
		super(Name);
		this.Color = Color;
	}
	
	public String getColor()
	{
		return Color;
	}
	
	public String speak()
	{
		return "meow";
	}
	
	public String move()
	{
		return "pounce";
	}

}
