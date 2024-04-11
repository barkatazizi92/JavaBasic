package class13;
/*
Create an method which is going to take an array as input and its going to return
the count of number which are greater than in that array
 */
public class Task4 {

    int number (int [] array){
        int count = 0;
        for ( int i = 0; i< array.length; i++) {
            if (array[i]>10){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Task4 task = new Task4();
        int [] ar={10,20,30,40,87,4,94};
       int result =  task.number(ar);
        System.out.println(result);
    }
}
