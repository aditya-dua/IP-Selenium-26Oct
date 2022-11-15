package polymorphism;

public class OverloadingExample {
	
	// Function Overloading

	public void area() {
		
	}
	
	public void area(int side) {
		System.out.println("The area of square is: "+side*side);
	}
	
	public void area(int length, int breadth) {
		System.out.println("The area of rectangle is: "+length*breadth);
	}
	
	public void area(double radius) {
		System.out.println("The area of circle is: "+(3.14*radius*radius));

	}
}
