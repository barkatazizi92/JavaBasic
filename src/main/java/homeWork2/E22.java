package homeWork2;

import java.util.Scanner;

/*
Write a program to take username, age and mobile number First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format) Third Output: "Enter your age"

Output:
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
 */
public class E22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your mobile number");
        String mobile = scan.next();
        System.out.println("your name is " + name + " your age is " + age +" your mobile number is " + mobile);

    }
}
