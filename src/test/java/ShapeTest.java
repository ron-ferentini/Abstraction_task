import static org.junit.jupiter.api.Assertions.assertEquals;

import codefinity.figure.Circle;
import codefinity.figure.Rectangle;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.calculateArea(), 0.0001);
    }

    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.41592653589793, circle.calculatePerimeter(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24.0, rectangle.calculateArea(), 0.0001);
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(20.0, rectangle.calculatePerimeter(), 0.0001);
    }
}
