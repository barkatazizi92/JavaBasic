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
public class E79 {
    public static void main(String[] args) {
        int [][] sumNumbers={
                {2,4,5,6,1}, //sum = 18
                {1,2,3,5,4}, //sum = 15
                {8,1,2,5,1}, //sum = 17
                {3,2,4,4,2} // sum = 15
        };
        int sum =0;
        int sum1=0;
        int sum2 =0;
        int sum3 = 0;
        for (int i =0; i<=sumNumbers.length; i++){
            sum=sum+sumNumbers[0][i];
            sum1=sum1+sumNumbers[1][i];
            sum2=sum2+sumNumbers[2][i];
            sum3+=sum3=sumNumbers[3][i];
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}
