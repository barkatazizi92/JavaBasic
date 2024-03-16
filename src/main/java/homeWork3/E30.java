package homeWork3;

import java.util.Scanner;

/*
Write a program to take the month number from a user. Provide month name to the
 corresponding month number If a user provides any number that is out of month range,
  the program should display "Invalid" IMPORTANT: use Scanner Class
Output:
Example Output:
Please enter month number 1
January
Please enter month number 33
Invalid
 */
public class E30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        int number = scan.nextInt();
        if (number<=31){
            System.out.println("January");
        }else
            System.out.println("Invalid");

    }
}
