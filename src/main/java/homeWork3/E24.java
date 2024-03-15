package homeWork3;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/***For you to do:**
 Write a program that takes a user's name and prints it.

 **Output:**
 Hello, please enter your name
 Your name is Sumair
 ```*/
public class E24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Please enter you name");
        String name = scan.nextLine();

        System.out.println("Your name is " +name);
    }

}
