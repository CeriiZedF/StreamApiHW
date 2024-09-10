import java.util.Objects;

public class ProjectorTask4 {
    private String name;
    private int year;
    private double price;
    private String manufacturer;

    public ProjectorTask4(String name, int year, double price, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectorTask4 projector = (ProjectorTask4) o;
        return year == projector.year &&
                Double.compare(projector.price, price) == 0 &&
                Objects.equals(name, projector.name) &&
                Objects.equals(manufacturer, projector.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, price, manufacturer);
    }
}
