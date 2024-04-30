package class23;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to  Remove any number that is divisible by 5 from that arrayList.
 */
public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumber = new ArrayList<>();

        for(int i = 0; i <= 500; i=i+2){
            evenNumber.add(i);
        }
        System.out.println(evenNumber+" ");
/*
        for(int number: evenNumber){
            if(number %5==0){
                System.out.println(number);
           }
 */
        evenNumber.removeIf(c->c%5==0);
        System.out.println(evenNumber);
        }
    }

