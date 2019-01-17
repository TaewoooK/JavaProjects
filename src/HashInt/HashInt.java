package HashInt;

public class HashInt extends Object implements Comparable
{
	private int x;

	// Constructor #1
	public HashInt()
	{
		this.x = 0;
	}

	// Constructor #2
	public HashInt(int x)
	{
		this.x = x;
	}

	// Constructor #3
	public HashInt(HashInt other)
	{
		this.x = other.x;
	}

	// toString()
	public String toString()
	{
		return "" + this.x;
	}

	// equals()
	public boolean equals(Object obj)
	{
		HashInt other =  (HashInt) obj;
		if(this.x == other.x)
			return true;
		return false;
	}

	// compareTo
	public int compareTo(Object obj)
	{
		HashInt other = (HashInt) obj;
		if(this.x < other.x)
			return 1;
		else if(this.x > other.x)
			return -1;
		return 0;	
	}
	
	// Immutable vs Mutable
	// A class is immutable until a Set method is written
	// which gives control or partial control of the
	// property value to the user of the class.
	
	public int getX()
	{
		return x;
	}
	
	public int setX(int x)
	{
		this.x = x;
		return x;
	}
	
	// Class-specific method would go here.
	
	
	
	
	
	
	

}
