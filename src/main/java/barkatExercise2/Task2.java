package barkatExercise2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade");
        char grade = scan.next().charAt(0);
        switch (grade){
            case'A':
                System.out.println("A - Excellent");
                break;
            case'B':
                System.out.println("B - Good");
                break;
            case('C'):
                System.out.println("C - Average");
                break;
            case('D'):
                System.out.println("D - Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
