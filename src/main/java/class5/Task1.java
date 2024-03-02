package class5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        int heights = scan.nextInt();
        if (heights< 60){
            System.out.println("Your height is short");
        }else if (heights> 60 && heights<72){
            System.out.println("Your height is medium");
        }else {
            System.out.println("You are over 72 inch");
        }
    }
}
