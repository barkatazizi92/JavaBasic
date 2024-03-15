package barkatExercise;

import java.util.Scanner;

public class ScannerTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the numbers of worked years");
        int workYears= scan.nextInt();
        if (workYears>=5){
            System.out.println("salary");
            int salary=scan.nextInt();
            if (salary>50000){
                System.out.println("Your bonus is = b5000");
            }else {
                System.out.println("You bonus = 3000");
            }
        }else{
            System.out.println("You are not eligible");
        }

    }
}
