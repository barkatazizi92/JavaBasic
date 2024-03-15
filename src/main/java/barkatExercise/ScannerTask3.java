package barkatExercise;

import java.util.Scanner;

public class ScannerTask3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("City");
        String city = scan.nextLine();
        System.out.println("Temperature");
        double temperature=scan.nextDouble();
        double celsius = (temperature - 32.) * 5/9;
        System.out.println("the temperature in the city "+ city + " is " + celsius);
    }
}
