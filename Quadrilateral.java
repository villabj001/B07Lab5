import java.awt.Point;

public class Quadrilateral {
	Point A; //top-left
	Point B; //top-right
	Point C; //bottom-left
	Point D; //bottom-right
	
	public Quadrilateral(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public boolean isSquare() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if(dAB==dBC && dBC ==dCD && dCD == dDA)
			return true;
		else
			return false;
	}
}
