package ArrayList;

import java.util.Random;
import java.util.ArrayList;

public class ArrayListTester {

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
	}

}
