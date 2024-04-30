package class23;

import java.util.ArrayList;

// Create a arraylist of cars and retrieve all the values using 2 different ways.
public class Task2 {
    public static void main(String[] args) {
        ArrayList <String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Mercedes");
        car.add("BMW");
        System.out.println(car);

        System.out.println("******");

        for (String c : car){
            System.out.println(c);
        }
        System.out.println();

        for (int i =0; i<car.size(); i++){
            System.out.println(car.get(i));
        }
        System.out.println();
        car.forEach(x-> System.out.println(x));
    }
}
