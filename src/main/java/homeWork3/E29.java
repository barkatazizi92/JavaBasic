package homeWork3;

import java.util.Scanner;

/*
Write a java program that prints out true if ( x y ) returns a positive value.
 Else prints out false if (x y) returns a negative value. Step 1: Your program should ask
 "Please enter first number" - for the 1st number and "Please enter second number"- for the 2nd number.
  Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
  If the result of a multiplication is positive print true, otherwise print false.
Output:
Example Output:
Please enter first number
Please enter second number
true

Example Output:
Please enter first number
Please enter second number
false
IMPORTANT: Must use a Scanner class
 */
public class E29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = scan.nextInt();
        System.out.println("Please enter second number");
        int y = scan.nextInt();

        int result =(x*y);

        if (result>0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
