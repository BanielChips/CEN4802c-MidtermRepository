/**
 * Project: Java Calculator
 * File: JavaCalculator.java
 *
 * Description:
 * This class is the build for the midterm project, CEN 4802C
 * The class is a simple calculator class with basic arithmetic
 * operations.
 * It is intended for single operations, not complication expressions,
 * - e.g. 2+2, not 2+(2*10)-3.
 * The class does not use the order of operations.
 *
 * Author: Daniel Reecy
 * Date: 09/28/2024
 * Course: CEN 4802C
 *
 * Usage:
 *   - This class is used to complete arithmetic operations including:
 *      add(), subtract(), multiply(), and divide().
 *   - This class does not operate on multiple operations at once.
 *      Each method takes only two inputs for basic operations.
 */


/**
 * The JavaCalculator class provides methods to perform basic arithmetic operations
 * such as addition, subtraction, multiplication, and division.
 */
public class JavaCalculator {
    /**
     * Adds two numbers together.
     *
     * @param x the first number
     * @param y the second number
     * @return the sum of x and y
     */
    public double add(double x, double y) {return x + y;}

    /**
     * Subtracts the second number from the first number.
     *
     * @param x the first number
     * @param y the second number
     * @return the result of subtracting y from x
     */
    public double subtract(double x, double y) {
        return x - y;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param x the first number
     * @param y the second number
     * @return the product of x and y
     */
    public double multiply(double x, double y) {
        return x * y;
    }

    /**
     * Divides the first number by the second number.
     * Throws an ArithmeticException if either x or y is zero.
     *
     * @param x the dividend
     * @param y the divisor
     * @return the result of dividing x by y
     * @throws ArithmeticException if x or y is zero
     */
    public double divide(double x, double y) {
        if(x == 0 || y == 0) throw new ArithmeticException("Divide by zero");
        return x / y;
    }

    public static void main(String[] args) {
        JavaCalculator c = new JavaCalculator();
        double x = 10, y = 2;

        double addition = c.add(x, y);
        double subtraction = c.subtract(x, y);
        double multiplication = c.multiply(x, y);
        double dividend = c.divide(x, y);

        System.out.println("Result Addition: 10 + 2 = " + addition);
        System.out.println("Result Subtraction: 10 - 2 = " + subtraction);
        System.out.println("Result Multiplication: 10 * 2 = " + multiplication);
        System.out.println("Result Division: 10 / 2 = " + dividend);
    }
}