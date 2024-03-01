package class4;

import java.util.Scanner;

public class E8Scanner {

    public static void main(String[] args) {

     Scanner information = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name =information.nextLine();
        System.out.println("Please enter your age");
        int age= information.nextInt();
        System.out.println("Please enter your salary");
        int salary=information.nextInt();
        System.out.println("My name is " + name+  " My age is " +age + " My salary is " + salary);
    }
}
