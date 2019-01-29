package Widget;

public class OnlineWidget extends Widget{
	
	private String URL;
	
	//default constructors
	public OnlineWidget()
	{
		super();
		URL = "";
	}
	
	//non-default
	public OnlineWidget(String N, String D, Double p, String U)
	{
		super(N, D, p);
		URL = U;
	}
	
	//copy
	public OnlineWidget(OnlineWidget other)
	{
		super(other.getName(), other.getDescription(), other.getPrice());
		this.URL = other.URL;
	}
	
	//toString() - include URL
	public String toString()
	{
		return super.toString() + "\nURL: " + URL;
	}
	
	//equals() - use URL instead of Name/Price
	public boolean equals(Object obj)
	{
		OnlineWidget other = (OnlineWidget) obj;
		
		if(URL.equals(other.URL))
			return true;
		return false;
	}
	
	//getURL() - since URL is in this class
	public String getURL()
	{
		return URL;
	}
	
	//Any inherited method could be overriden
	//Any new method can be added here.
}
