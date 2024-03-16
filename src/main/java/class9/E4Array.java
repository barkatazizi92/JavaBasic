package class9;

public class E4Array {
    public static void main(String[] args) {
        // write a program to calculate the avg of these numbers
        // 10,25,45,66,85,100 and divided
        int []numbers= {10,25,45,66,85,100};
        int sum=0;
        for (int i=0; i <numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum/numbers.length);
        }
    }

