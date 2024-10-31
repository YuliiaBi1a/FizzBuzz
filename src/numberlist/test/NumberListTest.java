package numberlist.test;
import numberlist.NumberFilter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberListTest {
    private final NumberFilter numberFilter = new NumberFilter();

    @Test
    @DisplayName("Returns only numbers divisible by the given divisor")
    void givenListAndDivisor_thenReturnOnlyDivisibles() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9, 12));
        ArrayList<Integer> result = numberFilter.filterDivisibles(numbers, 3);
        assertEquals(new ArrayList<>(Arrays.asList(3, 6, 9, 12)), result);
    }

    @Test
    @DisplayName("Returns an empty list when no numbers are divisible by the divisor")
    void givenNoDivisibles_thenReturnEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        ArrayList<Integer> result = numberFilter.filterDivisibles(numbers, 3);
        assertTrue(result.isEmpty());
    }
}
