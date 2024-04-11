package homeWork5;

import java.util.Scanner;

/*Write code that will take in a String input and check to see if it is a palindrome or not.
 A palindrome means that the characters are the same forwards and backwards,
 ignoring spaces. Examples of palindromes: racecar was it a car or a cat I saw never odd or even rats
  live on no evil star Your check should be case insensitive too. For example, "Bob" is a palindrome,
  despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.

 */
public class Hw99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input that you want to see is palindrome or not");
        String isPalindrome = scan.nextLine();
        StringBuilder convert = new StringBuilder(isPalindrome);
        convert.reverse();
       String isSame = convert.toString();
       if(isPalindrome.equalsIgnoreCase(isSame)){
           System.out.println(true);
       }else {
           System.out.println(false);
       }
    }
}
