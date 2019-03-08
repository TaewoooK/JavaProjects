package FishPond;

public class Water extends PondItem{

	public Water(int x, int y) {
		super(new Location(y, x), "Water");
	}
	
	public Water(Location location) {
		super(location, "Water");
	}
	
	public String toString()
	{
		return "~~~~~";
	}

	// Water doesn't act
	public void act(PondItem[][] M) 
	{
		return;
	}

	// Water doesn't move
	public void move(PondItem[][] M) 
	{
		return;
	}



}
