package homeWork5;
/*
Create a String named s1 = "hello" check weather string is empty or not
Create a String named s2 = "" check weather string is empty or not
Expected Output:
false
true
 */
public class Hw90 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 ="";
     boolean result = s1.isEmpty();
     boolean result2 = s2.isEmpty();
        System.out.println("s1 is =" +result + " = not empty");
        System.out.println("s2 is = " +result2+ " = empty");
    }
}
