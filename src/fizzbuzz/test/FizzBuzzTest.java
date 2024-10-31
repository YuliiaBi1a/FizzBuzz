package fizzbuzz.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import fizzbuzz.Fizzbuzz;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {

        Fizzbuzz fizzBuzz = new Fizzbuzz();
        assertEquals("1", fizzBuzz.evaluate(1));
        assertEquals("2", fizzBuzz.evaluate(2));
        assertEquals("Fizz", fizzBuzz.evaluate(3));
        assertEquals("4", fizzBuzz.evaluate(4));
        assertEquals("Buzz", fizzBuzz.evaluate(5));
        assertEquals("Fizz", fizzBuzz.evaluate(6));
        assertEquals("Buzz", fizzBuzz.evaluate(10));
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
        assertEquals("16", fizzBuzz.evaluate(16));
    }
}
