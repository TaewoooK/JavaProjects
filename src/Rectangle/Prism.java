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


}
