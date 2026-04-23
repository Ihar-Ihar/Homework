package arithmetic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {

    @Test(dataProvider = "getData")
    void testFactorial(int number, int factorial) {
        assertEquals(FactorialCalculator.factorial(number), factorial);
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {5, 120},
                {0, 1},
                {3, 6}
        };
    }
}
