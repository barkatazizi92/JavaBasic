package homeWork3;

import java.util.Scanner;

/*
Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:

If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

Example Output:

Please enter your gender: M or F
Please enter your age
Man
Example Output:

Please enter your gender: M or F
Please enter your age
Boy
Example Output:

Please enter your gender: M or F
Please enter your age
Woman
Example Output:

Please enter your gender: M or F
Please enter your age
Girl
 */
public class E32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = scan.next().charAt(0);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (gender == 'f') {
            System.out.println("Women");
        } else if(gender=='m'){
            System.out.println("Man");
        }
    }
}
