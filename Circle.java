package B07Lab5;

public class Circle {
	Point centre;
	double radius;
	
	
	public Circle(Point centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double circumference() {
		return 2 * Math.PI * radius; 
	}
	
	public boolean contains(Point p) {
		return centre.distance(p) <= radius;
	}
}
