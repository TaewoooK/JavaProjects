package FishPond;

import java.util.ArrayList;

// Matrix of PondItems
public class Pond{

	private PondItem[][] thePond;
	
	public Pond(int numRows, int numCols)
	{
		thePond = new PondItem[numRows][numCols];
		this.fillPond();
	}
	
	public PondItem[][] getThePond()
	{
		return thePond;
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
	
	public ArrayList<Location> getNeighboringLocations(Location Loc)
	{
		ArrayList<Location> locArr = new ArrayList<Location>();
		Location T;
		
		for(int y = Loc.getRow()-1; y <= Loc.getRow()+1; y++)
			for(int x = Loc.getCol()-1; x <= Loc.getCol()+1; x++)
			{
				T = new Location(y, x);
				if(T.isValid(thePond) && thePond[y][x].getType().equals("Water"))
					locArr.add(thePond[y][x].getLocation());
			}
		return locArr;
	}
	
	public ArrayList<PondItem> getAllObject()
	{
		ArrayList<PondItem> everybody = new ArrayList<PondItem>();
		
		for(int i = 0; i < this.getNumRows(); i++)
			for(int j = 0; j < this.getNumCols(); j++)
				if(!(thePond[i][j].getType().equals("Water")))
					everybody.add(thePond[i][j]);
		return everybody;
	}
	
	public void allAct()
	{
		for(PondItem[] Row: thePond)
			for(PondItem item: Row)
				item.setActed(false);
		
		for(PondItem[] Row: thePond)
			for(PondItem item: Row)
				item.act(this);
	}
	
	
	
}
