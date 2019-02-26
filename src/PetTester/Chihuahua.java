package PetTester;

public class Chihuahua extends Dog{

	private int shiverRate;
	
	public Chihuahua(String Name, double weight, int shiverRate)
	{
		super(Name, weight);
		this.shiverRate = shiverRate;
	}
	
	public int getShiverRate()
	{
		return shiverRate;
	}
	
	public void setShiverRate(int shiverRate)
	{
		this.shiverRate = shiverRate;
	}
	
	
}
