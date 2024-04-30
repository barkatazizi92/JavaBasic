package homeWork5;

import java.util.Scanner;

/*
Create an array of names that will hold 5 String elements. Names must be taking from a user.
Print out the first three characters of each element of the array, one per line. Note:
 every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
Joh
Jan
Jim
Mik
Emi
 */
public class Hw104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        //write code from here
        // System.out.println("enter 5 names");

        for (int i = 0; i < 5; i++) {

            arr[i] = input.nextLine();
        }
        for (int j = 0; j < arr.length; j++) {
            String name = arr[j].substring(0, 3);
            System.out.println(name);
        }

    }
}

