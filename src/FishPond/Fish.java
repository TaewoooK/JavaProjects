package FishPond;

import java.util.ArrayList;

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
		ArrayList<Location> locs = P.getNeighboringLocations(this.getLocation());
		
		if(locs.size() == 0)
			return;
		
		Location newLoc;
		int x = (int)(Math.random() * locs.size());
		newLoc = locs.get(x);
		
		P.dropInPond(new Water(this.getLocation()));
		this.setLocation(newLoc);
		P.dropInPond(this);
		

	}

	
	
	
	
}
