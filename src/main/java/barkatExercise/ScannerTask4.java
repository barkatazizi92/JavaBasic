package barkatExercise;

import java.util.Scanner;

public class ScannerTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean creditCard = scan.nextBoolean();

        if (creditCard){
            System.out.println("What is balance on the card?");
            int balance = scan.nextInt();
            if(balance>1000){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("you can spend more money");
            }
        } else{
            System.out.println("We can offer you the credit card");
        }


    }
}
