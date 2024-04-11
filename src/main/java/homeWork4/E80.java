package homeWork4;
/*
Write a program that prints the total number of elements that are negative AND odd
Output: for example -3 is both negative and odd
3
 */
public class E80 {
    public static void main(String[] args) {
        int [][]negativeNumber={
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        int counter=0;
        for (int i =0; i<negativeNumber.length; i++){
            for (int j = 0; j<negativeNumber[i].length; j++){
             //   sum=sum+negativeNumber[i][j];
                if (negativeNumber[i][j] < 0 && negativeNumber[i][j]%2 !=0) {
                    counter++;
                    sum=sum+negativeNumber[i][j];
                }
            }
        }
        System.out.println("Elements " +counter);
        System.out.println(" total" + sum);
    }
}
