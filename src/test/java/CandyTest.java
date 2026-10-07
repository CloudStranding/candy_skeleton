import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 *
<!--//# BEGIN TODO: Name, student ID, and date-->
<p><b>Xiangjie Dong, 2072645, 2025-05-09</b></p>
<!--//# END TODO-->
 */
public class CandyTest {

    static final Candy SUT = null; // to simplify method calls

    static final long MAX_VALUE = 999999999999999999L;

    /**
     * Checks the result of SUT.divide(k, c).
     */
    private void check(long k, long c, boolean expected) {
        System.out.println("divide(" + k + ", " + c + ")");
        long result = SUT.divide(k, c);
        System.out.println("  result = " + result);
        assertEquals(expected, 0 <= result, "possible (0 <= result)");
        if (0 <= result) {
            assertTrue(result <= MAX_VALUE, "range (result <= MAX_VALUE)");
            assertEquals(result * k, c, "quotient (result * k == c)");
        }
    }

    // Test cases

    /** The given example. */
    @Test
    public void testDivideGivenExample() {
        check(3, 15, true);
    }

//# BEGIN TODO: Additional test cases
    @Test
    public void testDivideSmallNumbersPossible() {
        check(4, 20, true);
        check(5, 25, true);
        check(7, 49, true);
    }

    /** Division is impossible with small numbers. */
    @Test
    public void testDivideSmallNumbersImpossible() {
        check(3, 20, false);
        check(4, 15, false);
        check(7, 50, false);
    }

    /** Test with k = 1 (always possible). */
    @Test
    public void testDivideByOne() {
        check(1, 100, true);
        check(1, 0, true);
        check(1, MAX_VALUE, true);
    }

    /** Test with c = 0 (always possible with q = 0). */
    @Test
    public void testDivideZeroCandies() {
        check(5, 0, true);
        check(MAX_VALUE, 0, true);
    }

    /** Test with k = 0 (division impossible unless c = 0). */
    @Test
    public void testDivideByZero() {
        check(0, 0, true); // special case: 0/0 is undefined but we'll return 0
        check(0, 5, false);
        check(0, MAX_VALUE, false);
    }

    /** Test with large numbers where division is possible. */
    @Test
    public void testDivideLargeNumbersPossible() {
        check(123456789, 123456789 * 987654321L, true);
        check(MAX_VALUE / 2, MAX_VALUE / 2 * 2, true);
    }

    /** Test with large numbers where division is impossible. */
    @Test
    public void testDivideLargeNumbersImpossible() {
        check(MAX_VALUE, MAX_VALUE - 1, false);
        check(MAX_VALUE / 2, MAX_VALUE / 2 + 1, false);
    }
//# END TODO

}
