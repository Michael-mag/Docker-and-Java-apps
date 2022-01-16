package myCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    @Test
    public void addition_isCorrect(){
        double sum = BasicCalculator.addNumbers(5, 5);
        assertEquals(sum, 10);
    }

    @Test
    public void divideNumbers(){
        double ans = BasicCalculator.divideNumbers(10, 5);
        assertEquals(ans, 2);
    }
}
