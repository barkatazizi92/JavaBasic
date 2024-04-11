package homeWork3;

import java.util.Scanner;

/*
Create a program that prompt user with question: "Do you need a loan?"(Use a boolean)
If the result is true then prompt user with question: "What is your credit score?".
 Otherwise eligibility is "Unknown" Based on the score define users eligibility:
if score is below 600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive --> eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .
Output:
The eligibility is ____
 */
public class E35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scan.nextBoolean();
        if (loan) {
            System.out.println("What is your credit score?");
            int creditStore = scan.nextInt();
            if (creditStore < 600) {
                System.out.println("Eligibility = Not eligible");
            }
            if (creditStore > 600 && creditStore <= 700) {
                System.out.println("Eligibility = Maybe eligible");
            }
            if (creditStore > 701 && creditStore <= 800) {
                System.out.println("Eligibility = eligible");
            }
            if (creditStore > 801) {
                System.out.println("Eligibility = Definitely Eligible");
            }
        }
    }
}
