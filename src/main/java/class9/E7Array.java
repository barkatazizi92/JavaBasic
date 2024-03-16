package class9;

public class E7Array {
    public static void main(String[] args) {
        // calculate the avg of numbers which are greater than 25
        int[] numbers = {10, 25, 45, 66, 85, 100};
        int sum = 0;
        int counter=0;
        for (int n: numbers){
            if(n>25) {
                sum = sum + n;
                counter++;
            }
        }
        System.out.println(sum/counter);



    }
}
