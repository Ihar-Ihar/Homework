package arithmetic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @ParameterizedTest
    @MethodSource("getData")
    void testFactorial(int factorial, int number) {
        assertEquals(factorial, FactorialCalculator.factorial(number));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }

    private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(120, 5),
                Arguments.of(1, 0),
                Arguments.of(6, 3)
        );
    }
}
