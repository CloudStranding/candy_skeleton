/**
 * k kids together receive c candies.
 * They wonder whether it is possible
 * to divide all candies fairly.
 *
 * If this is possible, they also want to
 * know how many candies each of them gets.
 * This is a number q such that c == k * q .
 * k, c, and q are non-negative integers, less than 10^18.
 *
 * <p>
 * For instance, divide(3, 15) should return 5,
 * since 3 evenly divides 15, yielding 5 as quotient.
 *
 * NOTE: divide() does not have to be robust;
 * that is, you may assume that the precondition is always
 * satisfied: {@code 0 <= k < 10^18 and 0 <= c < 10^18}.
 *
 * <p>
 * Apply Test-Driven Development to solve this problem.
 *
<!--//# BEGIN TODO: Name, student ID, and date-->
<p><b>Xiangjie Dong, 2072645, 2025-05-09</b></p>
<!--//# END TODO-->
 */
public class Candy {

    /**
     * Returns a negative value to indicate
     * that the division is impossible, and otherwise,
     * returns the number of candies each kid gets.
     *
     * @param k  number of kids
     * @param c  number of candies
     * @return a negative value when division is impossible,
     *   and otherwise the number of candies each kid gets
     * @pre {@code 0 <= k < 10^18 && 0 <= c < 10^18}
     * @post {@code
     *   \return < 0 && \not (\exists int q; 0 <= q < 10^18; c == q * k)
     *   ||
     *   0 <= \return < 10^18 && c == \return * k}
     */
    static long divide(long k, long c) {
        long result; // value to be returned
//# BEGIN TODO: Provide method implementation
        if (k == 0) {
            // Special case: division by zero
            // According to test cases, return 0 when c is also 0, otherwise -1
            return (c == 0) ? 0 : -1;
        }
        
        // Check if c is divisible by k
        if (c % k == 0) {
            // Division is possible, return the quotient
            return c / k;
        } else {
            // Division is impossible
            return -1;
        }
//# END TODO
        return result;
    }

}
