package barkatExercise2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number and operator(+,-,*,/");
        double num1 =scan.nextDouble();
        double num2=scan.nextDouble();
        char operator =scan.next().charAt(0);

        switch (operator){
            case('+'):
                System.out.println("The result of 2 number is " +(num1+num2));
                break;
        }
    }
}
