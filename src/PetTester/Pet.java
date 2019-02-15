package PetTester;
// Pet.java
/*
	Class Pet is an abstract class that defines
	what properties a Pet shall have and what
	actions a Pet shall be able to do, minimum.
	Minimally, all Pets shall have a name and 
	a name tag. Every Pet shall have a speak()
	method and every Pet shall have a move() method.
	
	abstract means existing in thought or as an idea
	but not having a physical or concrete existence
	
	An abstract class cannot be used to create objects.
	abstract classes can only be used for inheritance.
	
	Method labeled abstract in this class must be 
	implemented in derived classes otherwise those
	classes will also be abstract.
	
	Having abstract methods in this class is the like
	having a built in mandatory interface.
*/

public abstract class Pet 
{
	private String Name;
	
	public Pet(String Name)
	{
		this.Name = Name;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public abstract String speak();
	public abstract String move();
	
}
