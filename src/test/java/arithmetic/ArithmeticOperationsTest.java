package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void testAdd() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, ArithmeticOperations.subtract(3, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, ArithmeticOperations.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, ArithmeticOperations.divide(10, 5));
    }
}
