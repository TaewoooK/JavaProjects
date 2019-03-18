package RecursiveFunction;

public class RecursiveFunction {

	public static void main(String[] args) {

		System.out.println(factorial(4));
		
	}
	
	public static long factorial(long n)
	{
		if(n <= 0)
			return 1;
		else
			return factorial(n-1) * n;
	}
}
