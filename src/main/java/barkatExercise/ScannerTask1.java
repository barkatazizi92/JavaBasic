package barkatExercise;

import java.util.Scanner;

/*
You are a loan specialist, and you need to ask user what is the amount of the loan
is needed. if loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client
 */
public class ScannerTask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the amount of loan is needed?");
        int loan = scan.nextInt();
        if (loan<=200000){
            System.out.println("You would lend the money");
        } else{
            System.out.println("You would reject the client");
        }
    }
}
