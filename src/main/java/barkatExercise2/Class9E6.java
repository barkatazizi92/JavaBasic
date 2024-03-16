package barkatExercise2;

public class Class9E6 {

    public static void main(String[] args) {
      // calculate the avg of numbers using enhanced for loop
        int [] numbers={10,25,45,66,85,100,47,98,34};
        int num=0;
        for (int b :numbers ) {
            num=num+b;
        }
        System.out.println(num/numbers.length);

        }
    }
