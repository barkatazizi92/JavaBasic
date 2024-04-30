package class25.practice;

import java.util.*;

public class EntryMap {

    public static void main(String[] args) {
      Map<Integer,String> students = new TreeMap<>();
        students.put(1,"Nikola");
        students.put(6,"Will");
        students.put(7,"Ali");
        students.put(3,"Nikola");
        students.put(2,"Nikola");
        students.put(5,"Ali");
        System.out.println(students);

      Set<Map.Entry<Integer,String>> entry = students.entrySet();
        System.out.println(entry);


    }
}
