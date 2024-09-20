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
    void testSum_OnePlusOneEqualsTwo() {
        //assign
        int expected = 2;
        int actual = -1;

        //act
        actual = calculator.sum(1, 1);

        //assert
        assertEquals(expected, actual, "Regular sum should work");
    }

}
