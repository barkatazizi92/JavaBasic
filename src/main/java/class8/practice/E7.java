package class8.practice;

public class E7 {
    public static void main(String[] args) {
        // calculate the average of numbers which are greater than 25
        // use enhance for loop
        int[] name = {10, 25, 45, 66, 85, 100};

        int sum=0;
        int counter=0;
        for (int num : name){
           if(num>25){
               sum=sum+num;
               counter++;
           }
        }
        System.out.println(sum/counter);
    }
}
