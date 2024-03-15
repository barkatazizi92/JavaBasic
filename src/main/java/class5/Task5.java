package class5;

import java.util.Scanner;

/*
write a program to ask user to enter numbers of worked years and annual salary.
if user worked more or equals to 5 year than user is eligible for the bonus.
otherwise he is not. Once is eligible and salary  is larger than 50000
than bonus = 5000, otherwise bonus = 3000.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of worked years");
        double year = scan.nextDouble();
        if (year >= 5) {
            System.out.println("Please enter your salary");
            double salary = scan.nextDouble();
            System.out.println("Your are eligible for the bonus");
            if (salary > 50000) {
                System.out.println("Your bonus is 5000");
            } else {
                System.out.println("Your bonus is 3000");
            }
        } else {
            System.out.println("You are not eligible");
        }
    }
}
