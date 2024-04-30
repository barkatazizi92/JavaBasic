package homeWork5;

import java.util.Scanner;

/*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"

**Expected Output**:

sdneirF olleH
 */
public class Hw107 {

    public static void main(String[] args) {

        String given = "Hello Friends";
        StringBuffer stringBuffer = new StringBuffer(given);

        StringBuffer reverse = stringBuffer.reverse();

        System.out.println(reverse);





    }
}
