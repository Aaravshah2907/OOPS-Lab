import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
        private final Junitexample1 calculator = new Junitexample1();

        @Test
        void testAddition() {
            assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
            assertEquals(-1, calculator.add(2, -3), "2 + (-3) should equal -1");
        }

        @Test
        void testSubtraction() {
            assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
            assertEquals(5, calculator.subtract(2, -3), "2 - (-3) should equals 5");
        }

        @Test
        void testMultiplication() {
            assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
            assertEquals(-6, calculator.multiply(2, -3), "2 * (-3) should equal - 6");
        }

        @Test
        void testDivision() {
            assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
            assertEquals(-2.0, calculator.divide(6, -3), "6 / (-3) should equal - 2.0");
        }

        @Test
        void testDivisionByZero() {
            Exception exception = assertThrows(ArithmeticException.class, () ->
                    calculator.divide(1, 0));
            assertEquals("Division by zero",
                    exception.getMessage());
        }
    }


