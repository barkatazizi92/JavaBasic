package barkatExercise2;

import java.util.Scanner;

public class ForLoopsStepSize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the stating number of the loop");
        int num=scan.nextInt();
        System.out.println("Please enter the end number of the loop");
        int end = scan.nextInt();
        System.out.println("Please enter the step size");
        int stepSize=scan.nextInt();
        while (num>end){
            System.out.println(num);
            num=num-stepSize;
        }
        }
    }

