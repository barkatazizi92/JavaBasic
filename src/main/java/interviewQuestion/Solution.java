package interviewQuestion;

import java.util.Scanner;

public class Solution {
    /* a palindrome is a word, phrase, number, or other sequence of characters which reads
    the same backward of forward.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        StringBuilder str = new StringBuilder(a);
        str.reverse();
        String convert = str.toString();
        if(a.equals(convert)){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}
