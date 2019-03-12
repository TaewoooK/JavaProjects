package FishPond;

public class Fish extends PondItem{

	public Fish(int r, int c)
	{
		super(new Location(r, c), "Fish");
	}
	
	public Fish(Location location) 
	{
		super(location, "Fish");
	}

	public String toString()
	{
		return ">))*>";
	}
	
	public void act(Pond P)
	{
		this.move(P);
	}

	public void move(Pond P)
	{
		
	}

	
	
	
	
}
