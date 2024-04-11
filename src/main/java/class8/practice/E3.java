package class8.practice;

public class E3 {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,41,50},
                {22,40,90,65},
                {15,50,33,30}
        };

        // Add all the even numbers from this 2D array and print the sum
        int sum =0;
        for (int i = 0; i<3; i++){
            for(int j =0; j<4; j++){
                if (numbers[i][j]%2==0)
               sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);

    }
}
