package PetTester;

public class Dog extends Pet{

	public Dog(String Name) 
	{
		super(Name);
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
