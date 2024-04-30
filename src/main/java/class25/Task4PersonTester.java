package class25;

import java.util.Map;
import java.util.TreeMap;

class Task4PersonTester{
    /*
    In Test Class create a Map that will store key in ascending order. In that map store personId and a
Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc
     */
    public static void main(String[] args) {
        Map<Integer,Task4Person> personObject = new TreeMap<>();
        Task4Person person = new Task4Person("Hamid","Red bull",25,2222);
        Task4Person person1 = new Task4Person("Jamshid", "Wine",34,3333 );
        Task4Person person2 = new Task4Person("Sakhi", "Marjana", 45, 4444);

        personObject.put(1,person);
        personObject.put(2,person1);
        personObject.put(3,person2);

      for(Map.Entry<Integer,Task4Person> object: personObject.entrySet()) {
          System.out.println(object.getKey());
          System.out.println(object.getValue());
      }
          System.out.println("*******");
        System.out.println();

          personObject.forEach((k,v)-> System.out.println(v));


    }
}