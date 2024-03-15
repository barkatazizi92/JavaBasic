package barkatExercise;

import java.util.Scanner;
public class ScannerTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age>18){
            System.out.println("Issue driver license");
        } else{
            System.out.println("offer them a learning permit");
        }
    }
}
