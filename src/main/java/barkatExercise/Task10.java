package barkatExercise;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month= scan.nextLine();
        switch (month){
            case("December"):
            case("January"):
            case("February"):
                System.out.println("Winter");
                break;
            case("March"):
            case("April"):
            case("May"):
                System.out.println("Spring");
                break;
            case("june"):
            case("July"):
            case("August"):
                System.out.println("Summer");
                break;
            case("September"):
            case("October"):
            case("November"):
                System.out.println("Fall");
                break;
        }
    }
}
