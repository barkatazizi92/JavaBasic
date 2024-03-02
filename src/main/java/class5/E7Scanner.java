package class5;

import java.util.Scanner;

public class E7Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scan.nextInt();
        System.out.println("please enter your full name");
        String name= scan1.nextLine();
        System.out.println("your age " + age + " Your name " + name + " your year");

    }
}
