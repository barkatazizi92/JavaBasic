package barkatExercise2;

public class Class9E4 {

    public static void main(String[] args) {
        //write a program to calculate the average of these numbers
        // first we should add all the numbers and then divided by the index
        int [] numbers={10,25,45,66,85,100,47,98,34};
        int num=0;
        for(int i =0; i<numbers.length; i++){
            num+=numbers[i];
        }
        System.out.println(num/numbers.length);

    }
}
