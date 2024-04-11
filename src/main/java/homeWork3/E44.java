package homeWork3;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
Prompt user with questions: "Please enter your favorite car make"
if user enters BMW --> carOrigin = "german car"
if user enters Toyota --> carOrigin = " japanese car"
if user enters Maserati --> carOrigin = "italian car"
anything else besides those values --> carOrigin = "unknown"
The output of your program should be:
"Your favorite car is ___"
 */
public class E44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin =scan.nextLine();
        String car="";
        switch (carOrigin){
            case "BMW":
                car="german car";
                System.out.println("Your favorite car is " +car);
                break;
            case "Toyota":
                car="japanese car";
                System.out.println("Your favorite car is " + car);
                break;
            case "Maserati":
                car="italian";
                System.out.println("Your favorite car is " +car);
                break;
            default:
                System.out.println("unknown");
        }

    }
}
