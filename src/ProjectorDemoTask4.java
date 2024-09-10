import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectorDemoTask4 {
    public static void main(String[] args) {
        List<ProjectorTask4> projectors = Arrays.asList(
                new ProjectorTask4("Projector A", 2023, 1500.00, "Manufacturer X"),
                new ProjectorTask4("Projector B", 2022, 1200.00, "Manufacturer Y"),
                new ProjectorTask4("Projector C", 2023, 1800.00, "Manufacturer X"),
                new ProjectorTask4("Projector D", 2021, 800.00, "Manufacturer Z"),
                new ProjectorTask4("Projector E", 2024, 2000.00, "Manufacturer Y")
        );

        System.out.println("Все проекторы:");
        projectors.forEach(System.out::println);

        String manufacturerToFilter = "Manufacturer X";
        System.out.println("\nПроекторы производителя " + manufacturerToFilter + ":");
        projectors.stream()
                .filter(p -> p.getManufacturer().equals(manufacturerToFilter))
                .forEach(System.out::println);

        int currentYear = 2024;
        System.out.println("\nПроекторы текущего года " + currentYear + ":");
        projectors.stream()
                .filter(p -> p.getYear() == currentYear)
                .forEach(System.out::println);

        double priceThreshold = 1500.00;
        System.out.println("\nПроекторы дороже " + priceThreshold + ":");
        projectors.stream()
                .filter(p -> p.getPrice() > priceThreshold)
                .forEach(System.out::println);

        System.out.println("\nПроекторы, отсортированные по цене (возрастание):");
        projectors.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .forEach(System.out::println);

        System.out.println("\nПроекторы, отсортированные по цене (убывание):");
        projectors.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .forEach(System.out::println);

        System.out.println("\nПроекторы, отсортированные по году выпуска (возрастание):");
        projectors.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getYear(), p2.getYear()))
                .forEach(System.out::println);

        System.out.println("\nПроекторы, отсортированные по году выпуска (убывание):");
        projectors.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getYear(), p1.getYear()))
                .forEach(System.out::println);
    }
}
