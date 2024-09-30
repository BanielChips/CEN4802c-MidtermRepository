import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JavaCalculatorTest {

    @Test
    @DisplayName("Calculator Addition Test")
    void testAdd() {
        JavaCalculator calculatorTest = new JavaCalculator();

        assertEquals(25,  calculatorTest.add(13,12));
        assertEquals(430, calculatorTest.add(215,215));
        assertEquals(99,  calculatorTest.add(0,99));
        assertEquals(105, calculatorTest.add(-20,125));
    }

    @Test
    @DisplayName("Calculator Subtraction Test")
    void testSubtract() {
        JavaCalculator calculatorTest = new JavaCalculator();

        assertEquals(100,  calculatorTest.subtract(225,125));
        assertEquals(1500, calculatorTest.subtract(3000,1500));
        assertEquals(-18,  calculatorTest.subtract(22,40));
        assertEquals(0,    calculatorTest.subtract(50,50));
    }

    @Test
    @DisplayName("Calculator Multiplication Test")
    void testMultiply() {
        JavaCalculator calculatorTest = new JavaCalculator();

        assertEquals(26,    calculatorTest.multiply(13, 2));
        assertEquals(2000,  calculatorTest.multiply(100, 20));
        assertEquals(0,     calculatorTest.multiply(0, 50));
        assertEquals(-100,  calculatorTest.multiply(20, -5));
    }

    @Test
    @DisplayName("Calculator Division Test")
    void testDivide() {
        JavaCalculator calculatorTest = new JavaCalculator();

        assertEquals(20, calculatorTest.divide(200,10));
        assertEquals(30, calculatorTest.divide(450,15));
        assertEquals(5,  calculatorTest.divide(10, 2));
        assertThrows(ArithmeticException.class, () -> calculatorTest.divide(0, 500));
    }
}