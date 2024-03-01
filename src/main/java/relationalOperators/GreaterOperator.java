package relationalOperators;

public class GreaterOperator {

    // Truck>

    public static void main(String[] args) {

        int truck = 25;
        int car = 15;

        boolean result = truck>car;
        boolean result2 = car>truck;
        boolean result3 = car>truck;
        boolean result4 = car<truck;

        System.out.println("The truck is bigger then car = " + result);
        System.out.println("Car is not bigger then truck = " + result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
