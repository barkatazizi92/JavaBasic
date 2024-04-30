package class25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
 the highest salary. Output should be in the below format
John Smith=$100000
 */
public class Task5NotComplete {
    public static void main(String[] args) {

        Map<String, Integer> nameSalary = new HashMap<>();
        nameSalary.put("Hamid Wine=", 1000);
        nameSalary.put("Najib Red boll=",2000);
        nameSalary.put("Nawid Power=",5000);

        String name="";
        int salary=0;

        for(Map.Entry<String,Integer> highSalary: nameSalary.entrySet()){
            if(salary<highSalary.getValue()){
               salary = highSalary.getValue();
              name = highSalary.getKey();
            }
        }
        System.out.println(name+ " $"+salary);
    }
}
