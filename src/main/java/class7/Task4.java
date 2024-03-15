package class7;
public class Task4 {
    public static void main(String[] args) {
        // from an array of integer elements find the largest number

        int[] numbers = {10, 20, 30, 80, 40, 50};
        int max= numbers[0];
        for (int bigger: numbers){
            if (max<bigger){
                max=bigger;
            }
        }
        System.out.println(max);
    }
}

