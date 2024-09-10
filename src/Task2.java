import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "Milk", "Cheese", "Butter", "Cream", "Milk", "Yogurt", "Milk",
                "Bread", "Butter", "Cheese", "Juice", "Milk"
        );

        Scanner scanner = new Scanner(System.in);

        showAllProducts(products);
        showShortNamedProducts(products);
        countProductOccurrences(products, scanner);
        showProductsStartingWith(products, scanner);
        showMilkProducts(products);

        scanner.close();
    }

    private static void showAllProducts(List<String> products) {
        System.out.println("Все продукты:");
        products.stream().forEach(System.out::println);
    }

    private static void showShortNamedProducts(List<String> products) {
        System.out.println("\nПродукты с названием меньше пяти символов:");
        products.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }

    private static void countProductOccurrences(List<String> products, Scanner scanner) {
        System.out.print("\nВведите название продукта для подсчета его вхождений: ");
        String productToCount = scanner.nextLine();
        long count = products.stream()
                .filter(p -> p.equalsIgnoreCase(productToCount))
                .count();
        System.out.println("Продукт '" + productToCount + "' встречается " + count + " раз");
    }

    private static void showProductsStartingWith(List<String> products, Scanner scanner) {
        System.out.print("\nВведите букву для фильтрации продуктов: ");
        char startingLetter = scanner.nextLine().charAt(0);
        System.out.println("Продукты, начинающиеся на букву '" + startingLetter + "':");
        products.stream()
                .filter(p -> p.toUpperCase().startsWith(String.valueOf(startingLetter).toUpperCase()))
                .forEach(System.out::println);
    }

    private static void showMilkProducts(List<String> products) {
        System.out.println("\nПродукты из категории 'Молоко':");
        products.stream()
                .filter(p -> p.equalsIgnoreCase("Milk") || p.equalsIgnoreCase("Cream") || p.equalsIgnoreCase("Yogurt"))
                .forEach(System.out::println);
    }
}
