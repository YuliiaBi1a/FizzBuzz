package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        Fizzbuzz fizzBuzz = new Fizzbuzz();

        // Перебираємо числа від 1 до 100
        for (int i = 1; i <= 100; i++) {
            // Викликаємо метод evaluate для кожного числа та виводимо результат на консоль
            System.out.println(fizzBuzz.evaluate(i));
        }
    }
}