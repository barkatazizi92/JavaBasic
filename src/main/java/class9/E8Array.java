package class9;

public class E8Array {
    public static void main(String[] args) {
        // Count how many even number are present in this array?
        int[] numbers = {10, 25, 45, 66, 85, 100,26,89,56,33};
        int counter=0;
        for(int n:numbers){

            if(n%2==0){
                counter++;
            }
        } System.out.println(counter);


    }
}
