package barkatExercise;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number");
        int day= scan.nextInt();
        if (day>1 && day<=5){
            System.out.println("Weekday");
        }else if (day>=6 && day<=7){
            System.out.println("weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
