package Rectangle;

public class Prism extends Rectangle {

	private double H;

	public Prism()
	{
		super();
		H = 1.0;
	}

	public Prism(double L, double W, double H)
	{
		super(L, W);
		if(H > 0)
			this.H = H;
		else
			H = 1.0;
	}
	
	public Prism(Prism other)
	{
		super(other.getLength(), other.getWidth());
		this.H = other.H;
	}
	
	public String toString()
	{
		return super.toString() + ", H = " + this.H;
	}

	// Method inherited from Rectangle
	// getLengh(), getWidth(), *toString()
	// We would need to override these also,
	// since they are not exactly appropriate for a Prism.
	// *area(), *perimeter(), *diagonal()
	
	// getHeight()
	public double getHeight()
	{
		return H;
	}
	
	// volume()
	public double volume()
	{
		return super.area() * H;
	}
	
	
	
}
