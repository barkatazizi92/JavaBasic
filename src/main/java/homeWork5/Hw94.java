package homeWork5;
/*
Create a String given="I love Java classes at Syntax"
Retrieve 2 Strings using substring method from given String and print them
Expected Output:
classes at Syntax
I love Java
 */
public class Hw94 {
    public static void main(String[] args) {
        String given ="I love jave classes at Syntax";
       String clas = given.substring(12, 29);
        System.out.println(given.substring(12,29));
        System.out.println(given.substring(0,12));


    }
}
