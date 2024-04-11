package homeWork5;

import java.util.Scanner;

/*
For you to do: You have Scanner class to input string value. If language is Java it should print the:
"Java is a programming language". If language is C it should print the: "C is a procedural programming language"
If language is C++ it should print the: "C++ is a middle-level programming language"
 If any other should print: "Doesn't match any programming language"
 */
public class Hw96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Language you are interesting");
       String language = scan.nextLine();
       switch (language){
           case"java":
               System.out.println("Java is a programming language");
               break;
           case "C":
               System.out.println("C is a procedural programming language");
               break;
           case"c++":
               System.out.println("C++ is a middle level programming language");
               break;
           default:
               System.out.println("Doesn't match any programming language");
       }
    }
}
