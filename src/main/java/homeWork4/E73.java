package homeWork4;

import java.util.Scanner;

/*
**For you to do:**
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
**Example:**
Input:
1
2
3
4
5
Output:
5
4
3
2
1
 */
public class E73 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int [] number = new int[5];
        number[0] =scan.nextInt();
        number[1]= scan.nextInt();
        number[2]=scan.nextInt();
        number[3]=scan.nextInt();
        number[4]=scan.nextInt();
        for (int i = number.length; i>0 ; i--) {
            System.out.println(i);
        }
    }
}

