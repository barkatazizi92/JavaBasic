package homeWork3;

import java.util.Scanner;

/*
Ask the user to enter his/her gender "Please enter your gender: M or E" and their age "Please enter your age"

You have 2 conditions:

If age is above 25, then check if a user entered E then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered E then the output should be "Girl" otherwise it should say "Boy"

Example Output:

Please enter your gender: M or E
Please enter your age
Man
Example Output:

Please enter your gender: M or E
Please enter your age
Boy
Example Output:

Please enter your gender: M or E
Please enter your age
Woman
Example Output:

Please enter your gender: M or E
Please enter your age
Girl
 */
public class E32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender: M or E");
        char gender = scan.next().charAt(0);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if(gender=='m'&& age>25){
            System.out.println("Man");
        }else if (gender=='f' && age>25){
            System.out.println("Women");
        }else if (gender=='m' && age<25){
            System.out.println("Boy");
        }else if (gender=='f' && age<25){
            System.out.println("Girl");
        }
        }
    }

