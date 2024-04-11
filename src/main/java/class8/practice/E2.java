package class8.practice;

public class E2 {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,40,50},
                {22,40,90,65},
                {15,50,33,30}
        };
        int sum =0;
        for (int i = 0; i<3; i++){
            for(int j =0; j<4; j++){
               sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);

    }
}
