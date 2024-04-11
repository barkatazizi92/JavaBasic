package homeWork4;

/*
Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers
For example, if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}
Then we should get the following array back:
4
6
11
3
 */
public class EEe79 {
    public static void main(String[] args) {
        int[][] sumNumbers = {
                {2, 4, 5, 6, 1}, //sum = 18
                {1, 2, 3, 5, 4}, //sum = 15
                {8, 1, 2, 5, 1}, //sum = 17
                {3, 2, 4, 4, 2} // sum = 15
        };


        for (int i = 0; i < sumNumbers.length; i++) {
            int calculate = 0;


            for (int j = 0; j < sumNumbers[i].length; j++) {

                calculate = calculate + sumNumbers[i][j];
            }
            System.out.println(calculate);
        }
        }
    }

