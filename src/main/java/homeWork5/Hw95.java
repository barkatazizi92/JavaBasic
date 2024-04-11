package homeWork5;

import java.util.Scanner;

/*
Using Scanner class input string value.
Print out the following: "The first 3 letters of ___ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban"
 */
public class Hw95 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String name= scan.nextLine();
        System.out.println("The first 3  letter or "+ name +" is " + name.substring(0,3));
    }
}
