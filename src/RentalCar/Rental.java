package RentalCar;
/*
	The Rental class shall contain all properties
	and methods that are similar to all rental vehicles.
	Also Rental shall have two abstract methods that
	shall be inherited by all derived classes.
					 Rental
						|
			|						|
		CompactCar			       SUV
	
*/

public class Rental {

	private String VIN;
	private int timePeriod;
	private double cost;
	private boolean insured;
	private int milesDriven;
	
	public Rental(String VIN, int timePeriod, double cost)
	{
		this.VIN = VIN;
		this.timePeriod = timePeriod;
		this.cost = cost;
		this.insured = false;
		this.milesDriven = 0;
	}
	
	public String getVIN()
	{
		return VIN;
	}
	
	public int getTimePeriod()
	{
		return timePeriod;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public boolean getInsured() 
	{
		return insured;
	}
	
	public int getMilesDriven()
	{
		return milesDriven;
	}
	
	// timePeriod abstract
	
	// milesDriven abstract
	
	// cost abstract
	
	
	
}
