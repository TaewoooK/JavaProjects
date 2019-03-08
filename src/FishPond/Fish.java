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
	
	public void act(PondItem[][] M)
	{
		this.move(M);
	}

	public void move(PondItem[][] M)
	{
		
	}

	
	
	
	
}
