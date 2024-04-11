package class14;

public class LocalVariable {
     static void array(int[] arr) {
         int[] array;
       // int sum=0; // local variable which is inside the method
        int sum=0;
         for (int i = 0; i <6; i++){
            sum=sum+i; // i can call it again here inside the block of code.
            System.out.println(sum);
        }

    }
}
