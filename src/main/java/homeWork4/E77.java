package homeWork4;
/*
Write a program that prints the highest value in the array
**Expected Output:**
input [5,4,8]
8
 */
public class E77 {
    public static void main(String[] args) {
        int [] number ={5,4,8};

        int highest =number[0];

        for(int i = 0; i < number.length; i++){

            if (number[i]>highest){
            }
            highest=number[i];
        }
        System.out.println(highest);
    }
}
