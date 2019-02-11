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
	public static void sort(ArrayList<Double> T)
	{
		for(int n = 1; n <= T.size(); n++)
			for(int i = 0; i < T.size()-1; i++)
				if(T.get(i).compareTo(T.get(i+1)) > 0)
					T.set(i, T.set(i+1, T.get(i)));
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
		return new Double((summation().doubleValue())/L.size());
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
		sum /= (L.size()-1);
		return new Double(Math.sqrt(sum));
	}

	// median (without sorting list L, make a auxiliary list)
	public Double median()
	{
		ArrayList<Double> T = new ArrayList<Double>()	;
		for(int i = 0; i < L.size(); i++)
			T.add(L.get(i));
		this.sort(T);
		return null;
	}
	// max value
	// min value



}