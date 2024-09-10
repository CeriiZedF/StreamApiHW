import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numbers = random.ints(100, -1000, 1000)
                .boxed()
                .collect(Collectors.toList());

        // Количество положительных
        long positiveCount = numbers.stream()
                .filter(n -> n > 0)
                .count();

        // Количесво отрицательных
        long negativeCount = numbers.stream()
                .filter(n -> n < 0)
                .count();

        // Количество двухзначных
        long twoDigitCount = numbers.stream()
                .filter(n -> (Math.abs(n) >= 10 && Math.abs(n) <= 99))
                .count();

        //Количество зеркальных
        long palindromicCount = numbers.stream()
                .filter(n -> isPalindromic(n)) //myMethod
                .count();


        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество двухзначных чисел: " + twoDigitCount);
        System.out.println("Количество зеркальных чисел: " + palindromicCount);
    }


    private static boolean isPalindromic(int number) {
        String str = Integer.toString(Math.abs(number));
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
