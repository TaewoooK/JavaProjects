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
*/
public class CountingNumber extends HashInt 
{
	public CountingNumber()
	{
		super(1);
	}
	
	public CountingNumber(int x)
	{
		super(x);
	}
	
	public CountingNumber(HashInt x)
	{
		super(x);
	}
	

}
