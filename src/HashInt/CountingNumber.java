package HashInt;
// CountingNumber
/*
	CountingNumber extends HashInt which extends Object and
	is Comparable.
	A CountingNumber IS a Object
	A CountingNumber IS a HashInt
	A CountingNumber IS a Comparable

  	HashInt is the Parent Class or the Super class.
  	CountingNumber is the Child class or Sub class.
  	
  	A call to a parent class constructor method
  	MUST be the first line in the child constructor method.
  	IF it is not, then a call to the parent class
  	default constructor is done automatically.
  	
 */
public class CountingNumber extends HashInt 
{
	public CountingNumber()
	{
		super(1);
	}

	public CountingNumber(int x)
	{
		super(1);
		if(x > 0)
			super.setX(x);
	}

	// Copy constructor
	public CountingNumber(CountingNumber N)
	{
		super(N);
	}

	// Override toString() again
	public String toString()
	{
		return "#" + super.toString();
	}
	
	// We shall not override equals(), compareTo(), getX()
	
	// Override setX() to make it valid for CountingNumber
	public int setX(int x) 
	{
		if (x > 0)
			super.setX(x);
		return x;
	}
	
	// Class-specific method can be included here too.
	public int increment()
	{
		return super.setX((super.getX() + 1));
	}
	
	
}
