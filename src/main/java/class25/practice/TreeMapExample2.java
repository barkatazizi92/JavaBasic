package class25.practice;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.devtools.v85.network.model.InterceptionStage;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<String, Double> car = new TreeMap<>();
        car.put("BMW", 22222.56);
        car.put("Mersedes", 33333.5);
        car.put("Truck", 44444.6);
        car.put("Toyota", 11111.0);

        Collection<Double> cars = car.values();
        //var cars = car.values();
      //  System.out.println(cars);


        for(Double DV: cars){
            System.out.println(DV);
        }
    }
}
