package barkatExercise;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();//nextInt is waiting for us to enter a number in the console
        System.out.println("You are " + age+ " years old");
    }
}
