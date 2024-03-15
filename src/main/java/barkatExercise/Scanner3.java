package barkatExercise;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you name");
        String name = scan.nextLine();
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        System.out.println("Please enter you salary");
        int  salary= scan.nextInt();
        System.out.println("My name is "+ name + " My age is "+ age + " my salary is " + salary);


    }
}
