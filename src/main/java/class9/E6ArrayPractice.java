package class9;

public class E6ArrayPractice {
    public static void main(String[] args) {
        // calculate the average of numbers which are greater than 10
        // using enhance for loop
        int[] numbers = {10, 25, 45, 66, 85, 100,34,56};
        int average =0;
        int counter=0;
        for(int store: numbers){
            if(store>10){
                average=average+store;
                counter++;
            }
        }
        System.out.println(average*counter);

    }
}
