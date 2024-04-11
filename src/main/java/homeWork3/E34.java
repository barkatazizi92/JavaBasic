package homeWork3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
For you to do: Write a program to find the largest number among three distinct numbers using
nested if condition Please use Scanner class to take input from users
Expected Input:
Please enter 3 distinct numbers 4 5  and 14
Expected Output:
The largest number is 14
 */
public class E34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 distinct number");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("The largest number is " + number1);
            }
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is " + number2);
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println("The largest number is " + number3);
        }
    }
}
