import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeviceTask3 {

    public static void main(String[] args) {
        List<Device> devices = Arrays.asList(
                new Device("Smartphone", 2023, 699.99, "Black", "Mobile"),
                new Device("Laptop", 2022, 999.99, "Silver", "Computer"),
                new Device("Tablet", 2023, 499.99, "Black", "Mobile"),
                new Device("Smartwatch", 2023, 199.99, "Gold", "Wearable"),
                new Device("Desktop", 2021, 1199.99, "Gray", "Computer")
        );

        Scanner scanner = new Scanner(System.in);

        showAllDevices(devices);
        showDevicesByColor(devices, scanner);
        showDevicesByYear(devices, scanner);
        showDevicesAbovePrice(devices, scanner);
        showDevicesByType(devices, scanner);
        showDevicesByYearRange(devices, scanner);

        scanner.close();
    }

    private static void showAllDevices(List<Device> devices) {
        System.out.println("Все устройства:");
        devices.forEach(System.out::println);
    }

    private static void showDevicesByColor(List<Device> devices, Scanner scanner) {
        System.out.print("\nВведите цвет для фильтрации устройств: ");
        String color = scanner.nextLine();
        System.out.println("Устройства цвета '" + color + "':");
        devices.stream()
                .filter(d -> d.getColor().equalsIgnoreCase(color))
                .forEach(System.out::println);
    }

    private static void showDevicesByYear(List<Device> devices, Scanner scanner) {
        System.out.print("\nВведите год выпуска для фильтрации устройств: ");
        int year = scanner.nextInt();
        System.out.println("Устройства года выпуска " + year + ":");
        devices.stream()
                .filter(d -> d.getYear() == year)
                .forEach(System.out::println);
    }

    private static void showDevicesAbovePrice(List<Device> devices, Scanner scanner) {
        System.out.print("\nВведите минимальную цену для фильтрации устройств: ");
        double price = scanner.nextDouble();
        System.out.println("Устройства дороже " + price + ":");
        devices.stream()
                .filter(d -> d.getPrice() > price)
                .forEach(System.out::println);
    }

    private static void showDevicesByType(List<Device> devices, Scanner scanner) {
        System.out.print("\nВведите тип устройства для фильтрации: ");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.println("Устройства типа '" + type + "':");
        devices.stream()
                .filter(d -> d.getType().equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    private static void showDevicesByYearRange(List<Device> devices, Scanner scanner) {
        System.out.print("\nВведите начальный год диапазона: ");
        int startYear = scanner.nextInt();
        System.out.print("Введите конечный год диапазона: ");
        int endYear = scanner.nextInt();
        System.out.println("Устройства в диапазоне годов " + startYear + " - " + endYear + ":");
        devices.stream()
                .filter(d -> d.getYear() >= startYear && d.getYear() <= endYear)
                .forEach(System.out::println);
    }
}

class Device {
    private String name;
    private int year;
    private double price;
    private String color;
    private String type;

    public Device(String name, int year, double price, String color, String type) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("Device{name='%s', year=%d, price=%.2f, color='%s', type='%s'}",
                name, year, price, color, type);
    }
}
