package barkatExercise2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country name");
        String country= scan.nextLine();
        switch (country){
            case("Afghanistan"):
                System.out.println("Dari");
                break;
            case("Pakistan"):
                System.out.println("Urdo");
                break;
            case("Iran"):
                System.out.println("Persian");
                break;
            case("Jaghori"):
                System.out.println("Hazaragi");
                break;
            case("Bamyian"):
                System.out.println("Ghaliz Hazaragi");
        }
    }
}
