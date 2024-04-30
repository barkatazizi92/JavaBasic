package homeWork6;

/* Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise
 returned false ( Return false if one or both given numbers are not even)
Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false
**Output:**
false
 */
public class Hw116 {
    public boolean numbers(int num1, int num2) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Hw116 hw116 = new Hw116();
        System.out.println("Even number and odd number ==> " +hw116.numbers(2,5));
        System.out.println("Both even number ==> "+ hw116.numbers(4,6));
        System.out.println("Both odd number ==> " + hw116.numbers(3,7));
    }
}
