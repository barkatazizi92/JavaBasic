package exerciseClass5;

import java.util.Scanner;

public class LoanSpecialist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money you would like to borrow");

        int loan = scan.nextInt();

        if (loan<=200000){
            System.out.println("Approved");
        }else {
            System.out.println("Rejected");
        }
    }
}
