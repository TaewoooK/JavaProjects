package HashInt;

public class HashIntTester {

	public static void main(String[] args){

		HashInt A = new HashInt();
		System.out.println("A = " + A);
		
		HashInt B = new HashInt(25);
		System.out.println("B = " + B);
		
		if(A.equals(B))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		HashInt C = new HashInt(B);
		System.out.println("C = " + C);
		
		if(C.equals(B))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(A.compareTo(B) == 0)
			System.out.println("Equal");
		
		int y = C.getX();
		
		C.setX(15);
		
		y = C.setX(15);
		
		A.setX(B.setX(C.setX(25)));
		
		CountingNumber W = new CountingNumber();
		System.out.println("W = " + W);
		
		
		
		
	}

}
