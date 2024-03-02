package exerciseClass5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you live");
        String city = scan.nextLine();
        System.out.println("Enter the temperature");
        double temperature = scan.nextDouble();

        double converting =(temperature -32.0) * 5.0/9.0;

        System.out.println("I live in " + city + " the temperature is " + temperature + converting);

    }
}
