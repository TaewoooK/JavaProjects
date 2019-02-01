package ArrayList;

import java.util.Random;
import java.util.ArrayList;

public class ArrayListTester{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList Objs = new ArrayList();

		// Instantiation of an ArrayList<String> object.
		ArrayList<String> Names = new ArrayList<String>();

		// Instatiation of an ArrayList<Integer> object.
		ArrayList<Integer> Nums = new ArrayList<Integer>();

		// Adding objects to an ArrayList can be done
		// in two ways.

		Names.add("Joe");
		Names.add("Bob");
		Names.add("Mary");
		Names.add("Timmy");

		System.out.println("Names: " + Names);
		System.out.println("We have " + Names.size() + " names.");

		/*
 			Names: [Joe, Bob, Mary, Timmy]
		  	We have 4 names
		 */

		// add(int, Object) is the overloaded add method,
		// which adds the new object at the given position
		// after shifting all successive objects to-the-right.
		// and renumbering them.

		Names.add(1, "Jimmy");
		System.out.println("Names: " + Names);
		System.out.println("We have " + Names.size() + " names.");

		/*
			Names: [Joe, Jimmy, Bob, Mary, Timmy]
	  		We have 5 names
		 */

		// An ArrayList can possibly contain null references.
		Names.add(null);
		System.out.println("Names: " + Names);
		System.out.println("We have " + Names.size() + " names.");

		// remove(int) can be used to remove an element
		// from the ArrayList. It removed, returns, and renumbers.

		String person = Names.remove(0);
		System.out.println("Names: " + Names);
		System.out.println("We have " + Names.size() + " names.");
		System.out.println("We removed " + person);

		/*
			Names: [Joe, Jimmy, Bob, Mary, Timmy]
  			We have 5 names
  			We removed Joe
		 */

		// ArrayList has a Set method and a Get method too.
		person = Names.set(1, "Bobby");
		System.out.println("Names: " + Names);
		System.out.println("We have " + Names.size() + " names.");
		System.out.println("We changed the name " + person);

		Names.remove(Names.size()-1);

		person = Names.get(0);
		System.out.println("First Name: " + person);

		person = Names.get(Names.size()-1);
		System.out.println("Last Name: " + person);	
		
		Names.add("Timmy");
		Names.add(0, "Timmy");
		Names.add(3, "Timmy");
		Names.add(3, "Timmy");
		Names.add(3, "Timmy");
		Names.add(3, "Timmy");
		
		System.out.println("Lots of Timmy!");
		System.out.println("Names: " + Names);
		
		removeAll(Names, "Timmy");
		System.out.println();
		System.out.println("No more Timmy!");
		System.out.println("Names: " + Names);

	}

	// require .equals()
	public static int find(ArrayList<String> L, String K)
	{
		for (int i = 0; i < L.size(); i++)
			if(L.get(i).equals(K))
				return i;
		return -1;
	}

	// Returns the number of times K is found in list L.
	public static int countK(ArrayList<String> L, String K)
	{
		int c = 0;
		for (int i = 0; i < L.size(); i++)
			if(L.get(i).equals(K))
				c++;
		return c;
	}

	public static void removeAll(ArrayList<String> L, String K)
	{
		for (int i = 0; i < L.size(); i++)
			if(L.get(i).equals(K))
			{
				L.remove(i);
				i--;
			}
	}

	public static int highest(ArrayList<String> L)
	{
		return -1;
	}

	public static int sort(ArrayList<Integer> L)
	{
		return -1;
	}

}
