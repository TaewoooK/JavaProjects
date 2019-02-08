package StatListTester;
import java.util.ArrayList;
import java.lang.Math;
import java.util.List;

public class StatList implements Liist<Double>{

	private ArrayList<Double> L;

	public StatList()
	{
		L = new ArrayList<Double>();
	}

	public String toString()
	{
		return L.toString();
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

	// find uses Object.equals()
	public int find(Double K)
	{
		for (int i = 0; i < L.size(); i++)
			if(L.get(i).equals(K))
				return i;
		return -1;
	}

	// count value, uses Object.equals()
	// Returns the number of times K is found in list L.
	public int count(Double K)
	{
		int c = 0;
		for (int i = 0; i < L.size(); i++)
			if(L.get(i).equals(K))
				c++;
		return c;
	}

	// highest, uses Comparable.compareTo()
	// Works with all classes that implement Comparable
	// Returns the position of the highest value in L.
	public int highest()
	{
		int p = 0;
		for(int i = 0; i < L.size(); i++)
			if(L.get(p).compareTo(L.get(i)) > 0)
				p = i;
		return p;
	}

	// sort
	public void sort()
	{
		for(int n = 1; n <= L.size(); n++)
			for(int i = 0; i < L.size()-1; i++)
				if(L.get(i).compareTo(L.get(i+1)) > 0)
					L.set(i, L.set(i+1, L.get(i)));
	}

	// summation
	public Double summation()
	{
		double total = 0.0;
		for(int i = 0; i < L.size(); i++)
			total += L.get(i).doubleValue();
		return new Double(total);
	}

	// mean
	public Double mean()
	{
		return new Double((summation().doubleValue())/(double)L.size());
	}

	// standard deviation
	// The square root of, the sum of the squares of
	// the differences between each element and the mean
	// which is divided by n-1.
	public Double standardDeviation()
	{
		double sum = 0.0;
		for(int i = 0; i < L.size(); i++)
			sum += ((L.get(i) - mean().doubleValue())*(L.get(i) - mean().doubleValue()));
		sum /= (double)(L.size()-1);
		sum = Math.sqrt(sum);
		return new Double(sum);
	}

	// median (without sorting list L, make a auxiliary list)
	// max value
	// min value



}