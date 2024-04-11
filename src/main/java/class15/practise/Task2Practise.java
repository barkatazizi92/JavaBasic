package class15.practise;

import java.sql.PreparedStatement;

/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes with your project and accessible by class name
 */
public class Task2Practise {

   public static String companyName(String str){
       String [] arr = str.split(" ");
       String sum = "";
       for ( int i = arr.length -1; i>0; i--){
           sum=sum+arr.length;

       }
        return sum;
    }

    public static void main(String[] args) {
        Task2Practise task2Practise = new Task2Practise();
        String name = companyName("Trader joe");
        System.out.println(name);

    }
}
