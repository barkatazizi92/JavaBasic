package exerciseClass5;

import java.util.Scanner;

public class DMV {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scan.nextInt();
        if (age>=18){
            System.out.println("You are qualify ");
        }else{
            System.out.println("You need a learning permit");
        }

    }
}
