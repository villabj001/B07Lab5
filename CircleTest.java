package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testCircle() {
		Point centre = new Point(1,1);
		Circle c = new Circle(centre, 2);
		assertEquals(c.radius, 2);
	}
	
	@Test
	void testArea() {
		Point centre = new Point(1,1);
		Circle c1 = new Circle(centre, 2);
		assertEquals(c1.area(), Math.PI * 4);
	}
	
	@Test
	void testCircumference() {
		Point centre = new Point(1, 1);
		Circle c1 = new Circle(centre, 2);
		assertEquals(c1.circumference(), 2 * Math.PI * 2);
	}
	
	@Test
	void testContainsTrue() {
		Point centre = new Point(2, 2);
		Point p = new Point(3, 3);
		Circle c1 = new Circle(centre, 3);
		assertTrue(c1.contains(p));
	}
	
	@Test
	void testContainsFalse() {
		Point centre = new Point(1, 1);
		Point p = new Point(4, 4);
		Circle c1 = new Circle(centre, 2);
		assertFalse(c1.contains(p));
	}
}
