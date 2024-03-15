package barkatExercise;

import java.util.Scanner;

public class NotLogicalOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your heights");
        int height= scan.nextInt();
        if (height<60){
            System.out.println("short");
        }else if(height>60 && height<72){
            System.out.println("medium");
        }else {
            System.out.println("tall");
        }


    }
}
