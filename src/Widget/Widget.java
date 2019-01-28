package Widget;

public class Widget implements Comparable {

	private String Name;
	private String Description;
	private Double price;

	//default constructor
	public Widget()
	{
		Name = "";
		Description = "";
		price = new Double(0.0);
	}

	//non-default constructor
	public Widget(String N, String D, Double p)
	{
		Name = N;
		Description = D;
		price = p;
	}

	//copy constructor
	public Widget(Object obj)
	{
		Widget other = (Widget) obj;
		Name = other.getName();
		Description = other.getDescription();
		price = other.getPrice();
	}
	
	//toString()
	public String toString()
	{
		return Name + ": " + Description + " $" + price;
	}

	//equals()
	public boolean equals(Widget other)
	{
		if((Name.equals(other.getName())) && (price.equals(other.getPrice())))
			return true;
		return false;
	}

	public String getName()
	{ 
		return Name; 
	}

	public String getDescription()
	{
		return Description; 
	}
	
	public Double getPrice()
	{
		return price; 
	}

	//All three Set methods
	public String setName(String newName)
	{
		Name = newName;
		return newName;
	}
	
	public String setDescription(String newDescription)
	{
		Description = newDescription;
		return newDescription;
	}
	
	public Double setPrice(Double newPrice) 
	{
		price = newPrice;
		return newPrice;
	}
	
	public Double getPricePlusTax(double taxRate)
	{
		double T;
		T = price.doubleValue() * (1 + taxRate);
		return new Double(T);
	}

	//compareTo() (if the class implements Comparable)
	public int compareTo(Object obj) 
	{
		Widget other = (Widget) obj;
		return price.compareTo(other.getPrice());
	}




}