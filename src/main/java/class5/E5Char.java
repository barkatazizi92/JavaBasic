package class5;

import java.util.Scanner;

public class E5Char {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender = scan.next().charAt(0);
        System.out.println(gender);
    }
}
