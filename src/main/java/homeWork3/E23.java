package homeWork3;

import java.util.Scanner;

/* Create a program that will ask a user to input boolean value "Input the boolean value"
 If the input is true or false, then the output should look like below:

 **Output:**
 Example Output: Input the boolean value
 The value is true
 Example Output:  Input the boolean value
 The value is false
 ```*/
public class E23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean value = scan.nextBoolean();
        if(value){
            System.out.println("The value is " + value);
        }else
            System.out.println("The value is " + value);

    }
}
