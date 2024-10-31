package numberlist;
import java.util.ArrayList;

public class NumberFilter {
    public ArrayList<Integer> filterDivisibles(ArrayList<Integer> numbers, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % divisor == 0) {
                result.add(number);
            }
        }

        return result;
    }
}
