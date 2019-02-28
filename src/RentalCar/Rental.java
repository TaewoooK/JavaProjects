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

public abstract class Rental {

	private String VIN;
	private int timePeriod;
	private double cost;
	private boolean insured;
	private int milesDriven;
	
	// constructor
	public Rental(String VIN, int timePeriod, double cost)
	{
		this.VIN = VIN;
		this.timePeriod = timePeriod;
		this.cost = cost;
		this.insured = false;
		this.milesDriven = 0;
	}
	
	// getVIN()
	public String getVIN()
	{
		return VIN;
	}
	
	// getTimePeriod()
	public int getTimePeriod()
	{
		return timePeriod;
	}
	
	// getCost()
	public double getCost()
	{
		return cost;
	}
	
	// getInsured()
	public boolean getInsured() 
	{
		return insured;
	}
	
	// getMilesDriven()
	public int getMilesDriven()
	{
		return milesDriven;
	}
	
	// setTimePeriod
	public void setTimePeriod(int timePeriod)
	{
		this.timePeriod = timePeriod;
	}
	
	// setMilesDriven
	public void setMilesDriven(int milesDriven)
	{
		this.milesDriven = milesDriven;
	}
	
	// setCost
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public void buyInsurance(boolean add)
	{
		if (add && !insured)
		{
			this.cost *= 1.02;
			this.insured = true;
		}
		if (!add && insured)
		{
			this.cost /= 1.02;
			this.insured = false;
		}
	}
	
	// rentalDescription();
	public abstract String rentalDescription();
	public abstract double getRentalCost(int days, int miles);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
