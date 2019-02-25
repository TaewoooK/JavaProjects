package PetTester;

public class PetTester {

	public static void main(String[] args) {
		
		Dog D = new Dog("Otto", 43);
		
		System.out.println("Dog D: " + D.getName());
		System.out.println("---------------------------");
		
		Pet P = new Dog("Andy", 24.5);
		
		System.out.println("Pet P: " + P.getName());
		System.out.println("P.speak(): " + P.speak());
		System.out.println("P.move(): " + P.move());
		System.out.println("---------------------------");
		
		P = new Cat("Fluffy", "white");
		
		System.out.println("Pet P: " + P.getName());
		System.out.println("P.speak(): " + P.speak());
		System.out.println("P.move(): " + P.move());
		System.out.println("---------------------------");
		
		/*
 			Polymorphism 
 			
 			Polymorphism means "many changes."
 			The pet reference can refer to an object
 			of any class that extends Pet.
 			Note that to create an object of the derived
 			class (Dog, Cat) then that class MUST have
 			implemented the abstract methods speak() and move()
 			
 			P.getName() does not exhibit Polymorphism.
 			P.speak() and P.move() both exhibit Polymorphism.
 			
 			To exhibit Polymorphism a reference from
 			an abstract class (P) must refer to an object
 			of a class derived class derived from that
 			abstract class (new Dog()) and invokes and
 			abstract method (p.speak()).
		*/
		
	}

}
