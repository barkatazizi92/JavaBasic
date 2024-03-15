package class8;

public class E3TwoDArra {

    public static void main(String[] args) {
        /*
        10 20 40 50
        22 40 90 65
        15 50 33 30
         */
        int [][] numbers = new int  [3][4];
        numbers [0][0]=10;
        numbers [0][1]=20;
        numbers [0][2]=40;
        numbers [0][3]=50;
        numbers [1][0]=22;
        numbers [1][1]=40;
        numbers [1][2]=90;
        numbers [1][3]=65;
        numbers [2][0]=15;
        numbers [2][1]=50;
        numbers [2][2]=33;
        numbers [2][3]=30;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }
        System.out.println();


    }
}
