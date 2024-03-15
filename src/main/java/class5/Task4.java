package class5;

import java.util.Scanner;

/*
Create a java program that will ask if user has a credit card or not. if you user does not have a
credit card then offer them. if they do have one ask what is balance on the card? if balance of
the card is larger than 1000, tell them to pay off immediately, otherwise you can tell them
that they can spend more.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card");
        boolean haveCreditCard = scan.nextBoolean();
        if (haveCreditCard){
            System.out.println("What is the balance on the card");
            int balance =scan.nextInt();
            if (balance>1000){
                System.out.println("pay off immediately");
            }else
                System.out.println("you can spend more");
        }else {
            System.out.println("You can apply for credit card here");
        }
    }
}
