package PetTester;

public class Retriever extends Dog{
	
	private String Color;
	
	public Retriever(String Name, double weight, String Color)
	{
		super(Name, weight);
		this.Color = Color;
	}

	public String toString()
	{
		return super.toString() + " and is a " + Color + " retriever.";
	}
	
	public String getColor()
	{
		return Color;
	}
	
	
	
	
}
