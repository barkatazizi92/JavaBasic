package class10;

public class Car2Tester {

    public static void main(String[] args) {
        Car2 car2= new Car2();
        car2.carName="Sedan";
        car2.carColor="White";
        car2.carModel=2025;
        System.out.println(car2.carName);
        System.out.println(car2.carColor);
        System.out.println(car2.carModel);
        car2.faster();
        car2.AC();
    }
}
