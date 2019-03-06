package FishPond;

// Matrix of PondItems
public class Pond{

	private PondItems[][] thePond;
	
	public Pond(int numRows, int numCols)
	{
		thePond = new PondItem[numRows][numCols];
		this.fillPond();
	}
	
	public String toString()
	{
		String S = "";
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
		
	}
	
}
