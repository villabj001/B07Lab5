package B07Lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleExtraTest {
    
	@Test
    void testArea_RadiusZero() {
        Circle c = new Circle(new Point(0, 0), 0.0);
        assertEquals(0.0, c.area(), 1e-12);
    }
	
    @Test
    void testCircumference_RadiusZero() {
        Circle c = new Circle(new Point(5.5, -2.3), 0.0);
        assertEquals(0.0, c.circumference(), 1e-12);
    }
    
    @Test
    void testContainsTrue_onBoundary() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        assertTrue(c.contains(new Point(3.0, 4.0)));
    }
    
	@Test
    void testContainsFalse_justOutside() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        assertFalse(c.contains(new Point(3.1, 4.0)));
    }
}
