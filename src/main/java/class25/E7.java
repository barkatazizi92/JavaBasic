package class25;

import java.util.TreeMap;

public class E7 {
    public static void main(String[] args) {
        TreeMap<Integer,String> students = new TreeMap<>();
        students.put(1,"Nikola");
        students.put(6,"Will");
        students.put(7,"Will");
        students.put(3,"Nikola");
        students.put(2,"Nikola");
        System.out.println(students);
    }
}
