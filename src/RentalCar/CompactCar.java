package RentalCar;

public class CompactCar extends Rental{
	
	public CompactCar(String VIN, int timePeriod)
	{
		super(VIN, timePeriod, 49);
	}

	public String rentalDescription() 
	{
		return "Compact Car, $" + super.getCost() + " flat rate per day. Addictional 25c per mile if average daily mileage exceeds 120 miles.";
	}

	public double getRentalCost(int days, int miles) 
	{
		this.setTimePeriod(days);
		this.setMilesDriven(miles);
		
		double avgMiles, additionalCost;
		
		additionalCost = 0;
		avgMiles = (double)miles / days;
		
		if (avgMiles < 120)
			additionalCost = (miles - 120 * days) + 0.25;
		
		this.setCost(this.getCost() * days + additionalCost);
		
		return this.getCost();
	}
	
	

}
