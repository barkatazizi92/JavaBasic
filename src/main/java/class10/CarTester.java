package class10;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaCar = new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Prius";
        toyotaCar.year=2024;
        toyotaCar.color= "Red";
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.color);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBreaks();

        Car car2 = new Car();
        car2.make="Mercedes";
        car2.price=200000;
        car2.model="something";
        car2.year=2025;
        car2.color="Red";
        car2.moveForward();
        car2.applyBreaks();

    }
}
