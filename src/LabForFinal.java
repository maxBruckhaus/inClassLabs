/**
 * Created by MAXIMILLION on 12/13/14.
 */


public class LabForFinal {
    public int multiply(int x, int y){
        int product = 0;
        for (int i = 0; i<y; i++) {
            product += x;
        }
        return product;
    }

    public int power(int x, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = multiply(result, x);
        }
        return result;
    }

    public double power(String message, int base, int exponent) {
        System.out.println(message);
        double p = power(base, exponent);
        return p;
    }

    public static void main(String[] args) {
        LabForFinal lab = new LabForFinal();
        System.out.println(lab.power(10, 2));
        System.out.println(lab.power("Calculating result... ", 10, 2));
    }
}
