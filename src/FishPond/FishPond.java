package FishPond;

import java.util.ArrayList;

public class FishPond {

	public static void main(String[] args) throws InterruptedException {

		// Create a Pond
		Pond P = new Pond(10, 10);

		// Drop PondItems into the Pond

		// Invoke the Pond.allAct() method repeatedly
		// and print out the Pond.toString()

		System.out.println(P);
		Thread.sleep(2000);

		Fish nemo = new Fish(2, 3);
		P.dropInPond(nemo);

		System.out.println(P);
		Thread.sleep(2000);

		for(int i = 0; i < 50; i++)
		{
			P.allAct();
			System.out.println(P);
			Thread.sleep(2000);
		}


	}

	public static void clearScreen()
	{
		for(int i = 0; i < 50; i++)
			System.out.println("");
	}

}
