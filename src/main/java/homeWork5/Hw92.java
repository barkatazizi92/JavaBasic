package homeWork5;
/*
Validate if the string ends with "u" prints the boolean value accordingly.

Validate if the string ends with "world" prints the boolean value accordingly.

Validate if the string ends with "are" prints the boolean value accordingly.

Validate if the string ends with "you" prints the boolean value accordingly.
 */
public class Hw92 {
    public static void main(String[] args) {
        String s1 = " Hello how are you";
        System.out.println(s1);
        boolean uEnd =s1.endsWith("u");
        System.out.println("ends with u = "+ uEnd);
        boolean endWorld = s1.endsWith("world");
        System.out.println("ends with world = "+ endWorld);
        boolean endAre = s1.endsWith("are");
        System.out.println("ends with are = "+ endAre);
        boolean endYou = s1.endsWith("you");
        System.out.println("ends with you = "+ endYou);
    }
}
