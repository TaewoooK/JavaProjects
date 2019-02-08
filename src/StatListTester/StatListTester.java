package StatListTester;

public class StatListTester {

	public static void main(String[] args) {
		StatList theList = new StatList();
		
		System.out.println("theList.size() = " + theList.size() );
		
		theList.add(new Double(5));
		theList.add(new Double(20));
		theList.add(new Double(4));
		theList.add(new Double(15));
		theList.add(new Double(4));
		theList.add(new Double(1));
		
		System.out.println("L: " + theList);
		
		Double Sum = theList.summation();
		System.out.println("Sum: " + Sum); //49
		
		Double Mean = theList.mean();
		System.out.println("Mean: " + Mean);
	
		Double Dev = theList.standardDeviation();
		System.out.println("Dev = " + Dev);
		
	}

}
