package FishPond;
/*
	A Fish acts like a fish by moving around the Pond.
	A Fish
*/

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
	public void act(Pond P) 
	{
		return;
	}

	// Water doesn't move
	public void move(Pond P) 
	{
		
		
		return;
	}



}
