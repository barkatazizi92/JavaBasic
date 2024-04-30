package homeWork6;
/* Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
```
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */
public class Hw117 {
    public int sumEvenTox(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Hw117 hw117 = new Hw117();
        int num1 = hw117.sumEvenTox(8);
        int num2 = hw117.sumEvenTox(5);
        System.out.println("sumEvenToX(5) ==> " + num1);
        System.out.println("sumEvenToX(8) ==> "+num2);
    }
}
