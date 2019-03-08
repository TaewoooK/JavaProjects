package FishPond;

// Matrix of PondItems
public class Pond{

	private PondItem[][] thePond;
	
	public Pond(int numRows, int numCols)
	{
		thePond = new PondItem[numRows][numCols];
		this.fillPond();
	}
	
	public String toString()
	{
		String S = "";
		for(int y = 0; y < this.getNumRows(); y++)
		{
			for (int x = 0; x < this.getNumCols(); x++)
				S += thePond[y][x] + " ";
			S += "\n";
		}
		return S;
	}
	
	public int getNumRows()
	{
		return thePond.length;
	}
	public int getNumCols()
	{
		return thePond[0].length;
	}
	
	// fills the Pond with Water objects
	public void fillPond()
	{
		for(int y = 0; y < this.getNumRows(); y++)
			for (int x = 0; x < this.getNumCols(); x++)
				thePond[y][x] = new Water(y, x);
	}
	
	public boolean dropInPond(PondItem PItem)
	{
		if(PItem.getLocation().isValid(thePond))
		{
			thePond[PItem.getLocation().getRow()][PItem.getLocation().getCol()] = PItem;
			return true;
		}
		return false;
	}
}
