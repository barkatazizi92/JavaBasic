package homeWork5;

import javax.print.DocFlavor;
import java.util.Scanner;

/*
Given the following inputs: String s; Write a for loop that will print out the reverse of the string.
 Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar~~
racecar
 */
public class Hw100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In: ");
        String given = scan.nextLine();
        System.out.print("In: ");
        String given2 = scan.nextLine();
        System.out.print("In: ");
        String given3 = scan.nextLine();
        String result = given+given2+given3;
        StringBuilder input = new StringBuilder(result);
        input.reverse();
        String allInPuts = input.toString();
        for(int i =0; i <1;i ++){
            System.out.println(allInPuts);

        }
        System.out.println();


    }

}
