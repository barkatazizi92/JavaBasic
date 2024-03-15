package barkatExercise;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you age");
        int age= scan.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("you need to wait");
        }


    }
}
