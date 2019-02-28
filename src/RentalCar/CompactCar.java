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
		
		return 0;
	}
	
	

}
