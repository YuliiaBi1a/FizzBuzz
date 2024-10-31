package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        Fizzbuzz fizzBuzz = new Fizzbuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.evaluate(i));
        }
    }
}
