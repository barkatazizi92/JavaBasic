package class6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you country name");
        String country = scan.nextLine();

        switch (country){
            case"USA":
                System.out.println("We speak English");
                break;
            case"Afghanistan":
                System.out.println("We speak Dari/Pashto and Uzbaki");
                break;
            case"Pakistan":
                System.out.println("We speak Urdu");
                break;
            case"Iran":
                System.out.println("We speak persian");
                break;
            case"Russian":
                System.out.println("We speak Russian");
                break;
            default:
                System.out.println("Country not supported");
        }

    }
}