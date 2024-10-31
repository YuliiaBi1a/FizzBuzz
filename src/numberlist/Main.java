package numberlist;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NumberFilter numberFilter = new NumberFilter();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            numbers.add(i);
        }

        int divisor = 3;

        ArrayList<Integer> result = numberFilter.filterDivisibles(numbers, divisor);
        System.out.println("Numbers divisible by " + divisor + ": " + result);
    }
}


