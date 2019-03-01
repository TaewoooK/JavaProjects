package RentalCar;

public class SUV extends Rental{
	
	private boolean trailer;
	
	public SUV(String VIN, int timePeriod)
	{
		super(VIN, timePeriod, 449);
		trailer = false;
	}

	public String rentalDescription() 
	{
		String S;
		S = "SUV, " + this.getCost() + " per week ";
		S += "plus $59 for each additional day. ";
		S += "35c for each mile over 700. ";
		S += "SUV also has an additional trailer option ";
		S += "which is an additional $7 per day.";
		return null;
	}

	public double getRentalCost(int days, int miles) 
	{
	
		return 0;
	}

}
