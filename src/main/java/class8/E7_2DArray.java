package class8;

public class E7_2DArray {

    public static void main(String[] args) {
        int [][] matrix= {
                { 10, 20, 40, 50},
                { 22, 40, 90 ,65},
                {15, 50, 33, 30}
        };
        // add all of the elements from this 2D array and print the sum
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum=sum+matrix[i][j];
            }
        } System.out.println(sum);
    }
}
