package Rectangle;

//Rectangle
/*
  Rectangle class (version 1)
  A Rectangle contains a length and width values 
  stored as double. We can construct a 
  default Rectangle and a non-default Rectangle.
  Note: data properties are ALWAYS private.
  Note: Only one constructor method can be used 
  to create any one object. Only the new command
  can invoke a constructor method.
 */
public class Rectangle 
{
	private double L, W;    //data, properties, fields

	public Rectangle()        //default constructor
	{
		L = 1.0;
		W = 1.0;
	}
	//non-default constructor
	public Rectangle (double length, double width)
	{
		L = W = 1.0;
		if (length > 0)
			L = length;
		if (width > 0)
			W = width;
	}
	//Copy Constructor
	//Presently, Rectangle has no copy constructor

	//Accessor Get Methods
	public double getLength() { return L; }
	public double getWidth() { return W; }

	//Accessor Set Method
	//Set methods are not present,
	//so the class is presently immutable.

	//toString()
	//Over ridden toString() method should
	//return object data fields as a String.
	public String toString()
	{
		return "L = " + L + ", W = " + W;
	}
	//Class-specific methods
	//WAP: area(), perimeter(), diagonal()
	public double area()
	{
		double A;
		A = this.L * this.W;
		return A;
	}
	public double perimeter()
	{
		return 2 * L + 2 * W;
	}
	public double diagonal()
	{
		return Math.sqrt(Math.pow(L, 2) + Math.pow(W, 2));
	}
}
