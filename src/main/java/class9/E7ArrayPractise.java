package class9;

public class E7ArrayPractise {
    public static void main(String[] args) {
        // count how many even number are present in this array?
        int [] numbers={10,45,56,87,34,22,4,98};
        int counter = 0;

        for (int n : numbers){
            if(n %2 != 0) {
                counter++;

            }
        }
        System.out.println(counter);




    }
}
