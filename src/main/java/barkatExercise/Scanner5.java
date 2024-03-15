package barkatExercise;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallBox=scan.nextByte();
        System.out.println("Please enter a double number");
        double bigBox = scan.nextDouble();
        System.out.println("Please enter boolean value");
        boolean value=scan.nextBoolean();
        System.out.println("Please enter you name");
        String name = scan.nextLine();
        System.out.println("Byte number " + smallBox + " double number "+ bigBox + " boolean value "
        +value+ " your name " +name);

    }
}
