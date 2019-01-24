package Rectangle;

public class Square extends Rectangle{
	//Square does not require additional property fields.
	
	public Square() 
	{
		super();
	}
	
	public Square(double side)
	{
		super(side, side);
	}
	
	public Square(Square other)
	{
		super(other.getLength(), other.getLength());
	}
	
	// Methods inherited from Rectangle
	// getLength(), getWidth(), toString()
	// area(), perimeter(), diagonal()
	
	// Override toString()
	public String toString()
	{
		return "Side = " + super.getLength();
	}
	
	// Class spectific: getSide()
	public double getSide()
	{
		return super.getLength();
	}
}
