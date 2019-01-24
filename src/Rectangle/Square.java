package Rectangle;

public class Square extends Rectangle{
	//Square does not require additional property fields.
	
	public Square() 
	{
		
	}
	
	public Square(double side)
	{
		super(side, side);
	}
	
	public Square(Square other)
	{
		super(other.getLength(), other.getLength());
	}
	
	
}
