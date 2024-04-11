package homeWork3;

import java.util.Scanner;

/*
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
Output:
Today you will be learning ____
 */
public class E38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it weekend");
        boolean weekend = scan.nextBoolean();

        String subject="";

        if (!weekend){
            subject=("Manual testing");
        }else {
           subject=("Java");
        }
        System.out.println("Today you will be learning " + subject);
    }
}
