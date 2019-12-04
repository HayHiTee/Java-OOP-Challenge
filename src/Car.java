public class Car {
    private String brand;
    private String model;
    private int year;

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    Car(String brand, String model, int year){

         this.brand = brand;
         this.model = model;
         this.year = year;
     }

}
