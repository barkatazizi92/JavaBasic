package review5;

public class E2DArray {
    public static void main(String[] args) {
        String [][] names={
                {"james","Ihab", "Ana"},
                {"Zarina", "Teona","Manu"},
                {"Will","Barkat","olga"}
        };
        for (int row = 0; row<3; row++){
            for (int col =0; col<3; col++){
                System.out.print(names[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
