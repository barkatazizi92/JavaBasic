package review5;

public class E3_2DArray {
    public static void main(String[] args) {
        int [][] numbers ={
                {10,20,30,40},
                {50,70,15,88},
                {45,52,89,77}
        };
        for(int col=0; col<4;col++){
            for(int row=0; row<3; row++){
                System.out.println(numbers[row][col]);
            }
            System.out.println();
        }
    }
}
