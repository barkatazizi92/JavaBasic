package class6;

import java.util.Scanner;

/*
Using scanner class create calculator. Allow user to enter 2 numbers and
operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        System.out.println("+,-,*,/");
        char operator = scan.next().charAt(0);

        switch (operator){
            case'+':
                System.out.println("The result for operator + "+ (num1+num2));
                break;
            case'-':
                System.out.println("The result for operator - " + (num1-num2));
                break;
            case'*':
                System.out.println("The result for operator * "+ (num1*num2));
                break;
            case'/':
                System.out.println("The result for operator / " +(num1/num2));
                break;
            default:
                System.out.println("Wrong operator ");
        }

    }
}
