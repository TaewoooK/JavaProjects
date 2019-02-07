package StatListTester;
import java.util.ArrayList;
import java.util.List;

public class StatList implements Liist<Double>{
	
	private ArrayList<Double> L;
	
	public StatList()
	{
		L = new ArrayList<Double>();
	}

	public boolean isEmpty() 
	{
		if(L.size() == 0)
			return true;
		return false;
	}

	public boolean add(Double obj) 
	{
		return L.add(obj);
	}

	public void add(int p, Double obj) 
	{
		if (p >=0 && p <= L.size())
			L.add(p, obj);
		else if (p < 0)
			L.add(0, obj);
		else
			L.add(obj);
	}

	public int size() 
	{
		return L.size();
	}

	public Double get(int p) 
	{
		if (p >=0 && p < L.size())
			return L.get(p);
		return null;
	}

	public Double set(int p, Double obj) 
	{
		if (p >=0 && p < L.size())
			return L.set(p, obj);
		return null;
	}

	public Double remove(int p) 
	{
		if (p >=0 && p < L.size())
			return L.remove(p);
		return null;
	}

	// find
	// count
	// highest
	// sort
	// summation
	// mean
	// standard deviation
	// median (without sorting list L, make a auxiliary list)
	// max value
	// min value
	
	
	
}