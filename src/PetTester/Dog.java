package PetTester;

public class Dog extends Pet{

	private double weight;
	
	public Dog(String Name, double weight) 
	{
		super(Name);
		this.weight = weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public String toString()
	{
		return super.toString() + " weighs " + this.weight + " pounds";
	}
	
	public double getWeight()
	{
		return weight;
	}

	public String speak() 
	{
		return "woof";
	}

	public String move() 
	{
		return "run";
	}

}
