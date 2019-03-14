package FishPond;

// Remembers the x/y pair for any PondItem
public class Location {

	private int x;
	private int y;
	
	public Location(int y, int x)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + this.y + ", " + this.x + ")";
	}
	
	public boolean equals(Object obj)
	{
		Location other = (Location) obj;
		
		return this.y == other.y && this.x == other.x;
	}
	
	public int getRow()
	{
		return y;
	}
	public int getCol()
	{
		return x;
	}
	
	public boolean isValid(PondItem[][] M)
	{
		if(this.y >= 0 && this.y < M.length)
			if(this.x >= 0 && this.x < M[0].length)
				return true;
		return false;
	}
	
}
