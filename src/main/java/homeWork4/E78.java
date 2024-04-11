package homeWork4;
/*
Write a program that will print the sum of all elements in 2D array.
**Expected Output:**
-9
-9
 */
public class E78 {
    public static void main(String[] args) {
        int [][] numbers= {
                {-1,-1-1},
                {-1,-1,-1},
                {-1,-1,-1}
        };
        int sum=0;
        for(int i =0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
