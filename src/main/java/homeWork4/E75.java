package homeWork4;
/*
Write a program to print values from a 2D array
**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
 */
public class E75 {
    public static void main(String[] args) {
        int[][] number = {
                {1, 4, 2, 0, 3, 3, 2, 0},
                {4, 0, 1, 5, 6, 1, 1, 0},
                {1, 2, 3, 1, 4, 0, 1, 6}
        };
        for (int i = 0; i<=2; i++){
            for(int j=0; j<=7; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }
}
