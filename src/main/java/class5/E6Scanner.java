package class5;

import java.util.Scanner;

public class E6Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter you Full Name");
        scan.nextLine();
        String fullName = scan.nextLine();
        System.out.println("Your name is "+ fullName + " Your age is " + age + " Years old");
    }
}
