package homeWork5;

import java.util.Scanner;

/*
There is a code that takes input as a String.
Write a program that will print out only vowels of that string
```
Sample input/outputs:
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
public class Hw105 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In: ");
       String word =  scan.nextLine();

       String newWord = word.replaceAll("[^OEIOUoeiou]"," ".trim());
        System.out.println(newWord);
    }
}
