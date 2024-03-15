package barkatExercise;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter your full name");
        String fullName = scan2.nextLine();
        System.out.println("your name is " +fullName+ " you are " + age+ " year old");
    }
}
