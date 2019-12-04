import java.util.HashSet;

public class Part {
    private String code;
    private String name;

    private Category category;
    private double sellPrice;
    private double buyPrice;
    private HashSet<Car> cars ;
    private Manufacturer manufacturer;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("code=" + code);
        result.append("\n");
        result.append("name=" + name);
        result.append("\n");
        result.append("category=" + category);
        result.append("\n");
        result.append("sellPrice=" + sellPrice);
        result.append("\n");
        result.append("buyPrice=" + buyPrice);
        result.append("\n");
        result.append("manufacturer=" + manufacturer);
        result.append("\n");
        result.append("Cars: ");
        for (Car car: cars) {
            result.append(car);
            result.append("\n");
        }
        return result.toString();
    }




    Part(String code, String name, Category category, double sellPrice, double buyPrice, Manufacturer manufacturer) {
        this.code = code;
        this.name = name;
        this.cars = new HashSet<Car>();
        this.category = category;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.manufacturer = manufacturer;
    }

    void addCar(Car car){
        cars.add(car);
    }
}
