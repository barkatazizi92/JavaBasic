package class25.practice;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> car = new TreeMap<>();
        car.put("BMW", 22222.56);
        car.put("Mersedes", 33333.5);
        car.put("Truck", 44444.6);
        car.put("Toyota", 11111.0);

        // we use keySet to extract all the key value from a Map
       var key = car.keySet(); // var is work with local variable
       // Set<String> key = car.keySet();
       // we should convert from Map to set class, the same like above

        for(String k: key){
            System.out.println(k);
        }
        System.out.println("+++");

        key.forEach(x-> System.out.println(x));

        System.out.println("+++++");

        System.out.println(key);
    }
}
