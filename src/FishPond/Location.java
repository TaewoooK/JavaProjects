package FishPond;

// Remembers the x/y pair for any PondItem
public class Location {

	private int x;
	private int y;
	
	public Location(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getRow()
	{
		return y;
	}
	public int getCol()
	{
		return x;
	}
}
