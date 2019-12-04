public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car = new Car("toyota","C203",2008);
        Car innoson = new Car("Innoson","IVM",2019);
        System.out.println(car.toString());
        Manufacturer Toyota = new Manufacturer("Toyota", "Germany", "Crop2Cash", "+234587866", "1234440");
        System.out.println(Toyota.toString());
        Part part = new Part("C203", "Cyber Truck", Category.SUSPENSION, 120000.00, 100000.00,  Toyota);
        part.addCar(car);
        part.addCar(innoson);
        Store store = new Store("C2C");
        store.addPart(part);
        System.out.println(store.toString());

    }


}
