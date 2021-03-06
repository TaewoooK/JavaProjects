package FishPond;

public abstract class PondItem {

	private Location location;
	private String Type;
	private boolean acted;
	
	public PondItem(Location location, String Type)
	{
		this.location = location;
		this.Type = Type;
		acted = false;
	}
	
	public String toString()
	{
		return this.Type + " at " + this.location.toString();
	}
	
	public Location getLocation()
	{
		return this.location;
	}
	
	// setLocation()
	public Location setLocation(Location location)
	{
		Location oldL = this.location;
		this.location = location;
		return oldL;
	}
	
	// getType()
	public String getType()
	{
		return this.Type;
	}
	
	public boolean getActed()
	{
		return acted;
	}
	
	public void setActed(boolean acted)
	{
		this.acted = acted;
	}
	
	// abstract act()
	public abstract void act(Pond P);
	
	// abstract move()
	public abstract void move(Pond P);
	
	
}
