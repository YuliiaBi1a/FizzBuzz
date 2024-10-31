package fizzbuzz.test;
import fizzbuzz.Fizzbuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {

    Fizzbuzz fizzBuzz = new Fizzbuzz();

    @Test
    @DisplayName("Evaluating 1 should return '1'")
    public void testEvaluate1() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    @DisplayName("Evaluating 2 should return '2'")
    public void testEvaluate2() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    @Test
    @DisplayName("Evaluating 3 should return 'Fizz'")
    public void testEvaluate3() {
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    @DisplayName("Evaluating 4 should return '4'")
    public void testEvaluate4() {
        assertEquals("4", fizzBuzz.evaluate(4));
    }

    @Test
    @DisplayName("Evaluating 5 should return 'Buzz'")
    public void testEvaluate5() {
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    @DisplayName("Evaluating 6 should return 'Fizz'")
    public void testEvaluate6() {
        assertEquals("Fizz", fizzBuzz.evaluate(6));
    }

    @Test
    @DisplayName("Evaluating 10 should return 'Buzz'")
    public void testEvaluate10() {
        assertEquals("Buzz", fizzBuzz.evaluate(10));
    }

    @Test
    @DisplayName("Evaluating 15 should return 'FizzBuzz'")
    public void testEvaluate15() {
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

    @Test
    @DisplayName("Evaluating 16 should return '16'")
    public void testEvaluate16() {
        assertEquals("16", fizzBuzz.evaluate(16));
    }
}
