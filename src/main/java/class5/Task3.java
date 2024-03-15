package class5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you live");
        String city = scan.nextLine();
        System.out.println("What is the temperature in your city");
        int temperature = scan.nextInt();

       int fCovertCelsius = (temperature - 32) * 5/9;
        System.out.println("The temperature in your city " + city+ " is " + fCovertCelsius + " C");

    }
}
