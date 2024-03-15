package class5;

import java.util.Scanner;

/*
Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
 */
public class Task6Height {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your height in inches");
        double personHeight = scan.nextDouble();
        if (personHeight < 60) {
            System.out.println("Short");
        } else if (personHeight > 60 && personHeight < 72) {
            System.out.println("Medium");
        } else
            System.out.println("Tall");
    }
}