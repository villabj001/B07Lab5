import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.awt.Point;

class QuadrilateralTest {

	@Test
	void testPerimeterOfSquare() {
		Quadrilateral q = new Quadrilateral(
				new Point(0,0), 
				new Point(1,0),
				new Point(1,1),
				new Point(0,1)
				
		);
		assertEquals(4.0, q.perimeter());
	}
	
	@Test
	void testPerimeterOfRectangle() {
		Quadrilateral q = new Quadrilateral(
				new Point(0,0), 
				new Point(2,0),
				new Point(2,1),
				new Point(0,1)
				
		);
		assertEquals(6.0, q.perimeter());
	}
	
	@Test
	void testIsSquareTrue() {
		Quadrilateral q = new Quadrilateral(
				new Point(0,0), 
				new Point(2,0),
				new Point(2,2),
				new Point(0,2)
				
		);
		assertTrue(q.isSquare());
	}
	
	@Test
	void testIsSquareFalseRectangle() {
		Quadrilateral q = new Quadrilateral(
				new Point(0,0), 
				new Point(3,0),
				new Point(3,2),
				new Point(0,2)
				
		);
		assertFalse(q.isSquare());
	}
	
	@Test
	void testAllPointsSame() {
		Quadrilateral q = new Quadrilateral(
				new Point(0,0), 
				new Point(0,0),
				new Point(0,0),
				new Point(0,0)
				
		);
		assertTrue(q.isSquare());
		assertEquals(0.0, q.perimeter());
	}
	
	@Test
	void testNegativeCoordinates() {
		Quadrilateral q = new Quadrilateral(
				new Point(-1,-1), 
				new Point(-1,1),
				new Point(1,1),
				new Point(1,-1)
				
		);
		assertTrue(q.isSquare());
	}
	
}

