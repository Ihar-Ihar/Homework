package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberComparatorTest {

    @Test
    void testCompareLess() {
        assertFalse(NumberComparator.compare(3, 5));
    }

    @Test
    void testCompareEqual() {
        assertTrue(NumberComparator.compare(5, 5));
    }

}
