package review5;

public class E4_2DArray {
    // add the number those are greater then 40
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {50, 70, 15, 88},
                {45, 52, 89, 77}
        };
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(numbers[i][j]>=40){
                    sum=sum+numbers[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
