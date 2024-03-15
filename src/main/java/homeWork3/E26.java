package homeWork3;

import java.util.Scanner;

public class E26 {
    /***
     The variable "name" holds a String user input
     Write a conditional statement starting on line 9 that does the following:
     If name is equal to "Chen", print "teacher"
     For any other input, print "student"
     **Output:**
     Examples:
     In: Chen
     teacher
     In: Faa
     student
     Hint: for your if condition use if(name.equals("Chen")) - we haven't study it yet, but this is code to compare Strings. We will cover this topic soon.

     ```*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String name = scan.nextLine();
        if (name.equalsIgnoreCase("Chen")){
            System.out.println("Teacher");
        } else
            System.out.println("Student");
    }
}
