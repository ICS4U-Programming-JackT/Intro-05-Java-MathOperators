/**
* Print hello world in java.
* @author  Jack Turcotte
* @version 1.0
* @since   2025-09-05
*/

// Defines the class
public final class MathOperators {

    /**
     * This is a private constructor used to
     * satisfy the style checker.
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {
        // Addition
        System.out.println("2 + 5 = " + (2 + 5));
        // Subtraction
        System.out.println("5 - 2 = " + (5 - 2));
        // Multiplication
        System.out.println("2 * 5 = " + (2 * 5));
        // Division with integers
        System.out.println("6 / 2 = " + (6 / 2));
        // Division with floats
        System.out.println("5.5 / 2 = " + (5.5f / 2.0f));
        // Division with doubles
        System.out.println("5 / 2 = " + (5d / 2d));
        // Exponents to the power of 2
        System.out.println("5^2 = " + Math.pow(5, 2));
        // Exponents to the power of 3
        System.out.println("5^3 = " + Math.pow(5, 3));
        // Square root
        System.out.println("√25 = " + Math.sqrt(25));
        // Modulus
        System.out.println("5 % 2 = " + (5 % 2));
    }
}
