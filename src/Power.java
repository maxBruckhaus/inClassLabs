/**
 * Created by MAXIMILLION on 12/13/14.
 */
public class Power {

    public static double power(int base, int exponent, boolean negative_exponent) {
        if (negative_exponent) {
            return 1.0 / power(base, exponent);
        } else {
            return power(base, exponent);
        }
    }

    private static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}
