package arithmetic;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
