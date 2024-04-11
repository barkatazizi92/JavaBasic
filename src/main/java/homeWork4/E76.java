package homeWork4;
/*
Write a program to double the values of every element in the array and print it out.
**Example Output:**
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2
 */
public class E76 {
    public static void main(String[] args) {
        int [][]numbers={
                {2,8,4,0,6,6,4,0},
                {8,0,3,0,12,2,2,0},
                {2,4,6,2,8,0,3,2}
        };
        for (int i =0; i < numbers.length; i++){
            for(int j=0; j<8; j++){
                System.out.print(numbers[i][j] *2+" ");
            }
            System.out.println();
        }
    }
}
