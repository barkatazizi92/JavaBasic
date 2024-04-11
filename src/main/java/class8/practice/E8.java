package class8.practice;

public class E8 {
    public static void main(String[] args) {
        // count how many even number is present in this array
        int[] name = {10, 25, 45, 66, 85, 100, 26, 89, 56, 33};

        int countEven=0;
        for(int ev : name){
            if(ev%2==0){
                countEven++;
            }

        }
        System.out.println(countEven);

    }
}

