import de.justmage.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd_OnePlusOneEqualsTwo() {
        //assign
        int expected = 2;

        //act
        int actual = calculator.add(1, 1);

        //assert
        assertEquals(expected, actual, "Regular sum should work");
    }

}
