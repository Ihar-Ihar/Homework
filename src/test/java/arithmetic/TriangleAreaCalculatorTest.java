package arithmetic;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TriangleAreaCalculatorTest {

    @Test
    void testArea() {
        assertEquals(TriangleAreaCalculator.area(4, 5), 10);
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-1, 5));
    }
}
