package homeWork2;

import java.util.Scanner;

/*
Write a program that asks the user's age: "Enter your age "
Then display it by adding 10 (i.e age + 10) in your final output.

Output:
Enter your age 30
Your age after 10 years is 40
 */
public class E21 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        int afterTenYears = +10;
        System.out.println("your age after 10 year is "+(age+afterTenYears));
    }
}
