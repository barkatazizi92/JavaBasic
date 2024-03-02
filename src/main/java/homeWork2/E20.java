package homeWork2;

import java.util.Scanner;

/*
Write a program that takes user's first name and last name and prints in console
 Instruct the user to enter first name: "Please Enter First Name"
 Capture the first name Instruct the user to enter last name:"Please Enter Last Name"
 Capture last name Print first name and last name

Output:
Please Enter First Name
Please Enter Last Name
Cindy Crawford
 */
public class E20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Name");
        String firstName = scan.nextLine();
        System.out.println("Please Enter Last Name");
        String lastName = scan.nextLine();
        System.out.println(firstName+ " "+lastName);
    }
}
