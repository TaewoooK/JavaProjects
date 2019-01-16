package Circle;
//CircleTester
import java.lang.Math;
public class CircleTester {

	public static void main(String[] args) {

		double pi = Math.PI;

		Circle C1 = new Circle();

		Circle C2 = new Circle(4.5);

		System.out.println("C1 = " + C1);
		System.out.println("C2 = " + C2);
		/*
			Before overloading
			C1 = Circle@1db9742
			C2 = Circle@106d69c

			After overloading
			C1 = 1.0
			C2 = 4.5
		 */

		System.out.println("C1 = " + C1.circumference());
		System.out.println("C2 = " + C2.circumference());

		if(C1.equals(C2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

		if(C1.compareTo(C2) >= 0)
			System.out.println(C1 + " >= " + C2);
		else
			System.out.println(C1 + " < " + C2);

		Circle[] L = new Circle[5];
		L[0] = new Circle(35);
		L[1] = new Circle(5);
		L[2] = new Circle(15);
		L[3] = new Circle(55);
		L[4] = new Circle(-5);

		System.out.println("Before: ");
		printList(L);
		Sort(L);
		System.out.println("After: ");
		printList(L);
		
		int p = find(L, new Circle(55));
		System.out.println("p = " + p);
	}
	
	public static void printList(Object[] L)
	{
		for(int i = 0; i < L.length; i++)
			System.out.print(L[i] + " ");
		System.out.println();
	}
	
	public static void Sort(Comparable[] L)
	{
		Comparable Temp;
		
		for(int i = 0; i < L.length; i++)
			for(int j = 0; j < L.length-1; j++)
				if(L[j].compareTo(L[j+1]) > 0)
				{
					Temp = L[j];
					L[j] = L[j+1];
					L[j+1] = Temp;
				}
	}
	
	public static int find(Object[] L, Object K)
	{
		for(int i = 0; i < L.length; i++)
			if(L[i].equals(K))
				return i;
		return -1;
	}
	
}
