package homeWork6;

import java.util.Scanner;

/*
Write a method header with the following specs:
Returns:
a String
Name:
censorLetter
Parameters:
a String
a char
Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.

```
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
 */
public class Hw119 {

    public static String censorLetter(String character) {
        return character.replaceAll("e", "*");
    }

    public static void main(String[] args) {
       String name = censorLetter("Computer science");
        System.out.println(name);
    }



}
