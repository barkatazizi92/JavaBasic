package class5;

import java.util.Scanner;

public class E2Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a byte number ");
        byte smallBox= scanner.nextByte();
        System.out.println("Please enter double number");
        double bigBox = scanner.nextDouble();
        System.out.println("please enter a boolean value");
        boolean logicalBox=scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);


    }
}
