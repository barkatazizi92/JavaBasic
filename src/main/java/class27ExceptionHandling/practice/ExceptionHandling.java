package class27ExceptionHandling.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter a number");
            int num1 = scanner.nextInt();
            System.out.println("Please enter another number");
            int num2 = scanner.nextInt();
            System.out.println("The result of 2 number is = " + (num1 / num2));
        } // the first two catch are specific exception
        catch (ArithmeticException e) {
            System.out.println("Please enter non zero value");
        } catch (InputMismatchException e) {
            System.out.println("Please enter an Integer value");
            // this one is generic exception
        } catch (Exception e) {
            System.out.println("Please enter a valid input");
        } finally {
            System.out.println("Logic to close the DB connection");
        }
        /*Note: the specific exception are always in the top and the generic
        exception should be on the button.
        there can be more than one catch block but always one try block.
         */
    }
}
