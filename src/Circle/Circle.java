package Circle;

// Circle
/*
	Write class Circle, such that it contains
	one double property named r, a default constructor,
	a non-default constructor, a overloaded toString()
	method, a getRadius() accessor method and
	diameter(), area() and circumference() methods.
	Use Math.PI as the pi value.
*/
import java.lang.Math;
public class Circle implements Comparable {
	
	private double r;
	
	public Circle(){
		r = 1.0;
	}
	
	public Circle(double radius){
		if(radius > 0){
			this.r = radius;
		}else{
			r = 1.0;
		}
	}
	
	public Circle(Circle c)
	{
		this.r = c.r;
	}
	
	public String toString(){
		return "" + r;
	}
	
	public boolean equals(Object obj)
	{
		Circle B = (Circle) obj;
		if(this.r == B.r)
			return true;
		return false;
	}
	
	public double getRadius(Circle A){
		return A.r;
	}
	
	public double setRadius(double a)
	{
		if(a > 0)
			this.r = a;
		return a;
	}
	
	public int compareTo(Object obj)
	{
		Circle other = (Circle) obj;
		
		if(this.r < other.r)
			return -1;
		else if(this.r > other.r)
			return 1;
		return 0;
	}
	
	public double diameter(){
		return 2 * r;
	}
	
	public double area(Circle A){
		return Math.PI * Math.pow(A.r, 2.0);
	}
	
	public double circumference(){
		return Math.PI * diameter();
	}

}

