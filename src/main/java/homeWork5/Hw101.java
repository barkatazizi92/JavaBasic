package homeWork5;

import java.util.Scanner;

/*
Inputs: String word; Write a for loop that will print out every other letter in a String, starting with the
first letter. These letters should be printed all on one line with no space in between. Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies
 */
public class Hw101 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.print("In: ");
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i=i+2){
            System.out.print(word.charAt(i));
        }
    }
}

