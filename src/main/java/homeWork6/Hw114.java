package homeWork6;
/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
for the addition method add two numbers to make 30
for multiplication multiply two numbers to make 30
for Subtraction subtract two numbers to equal 20

**Output:**

```
Addition 30
Multiplication 30
Subtraction 20
```
 */
public class Hw114 {

    public void multiplication(int a , int b){
        System.out.println("Multiplication "+(a*b));
    }
    public void addition(int a , int b){
        System.out.println("Addition " +(a+b));
    }
    public void subtraction(int c , int d ){
        System.out.println("Subtraction " + (c-d));
    }

    public static void main(String[] args) {
        Hw114 hw114 = new Hw114();
        hw114.multiplication(2, 15);
        hw114.addition(15 , 15);
        hw114.subtraction(30 , 10);
    }


}
