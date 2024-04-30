package class25;

import java.util.*;

public class E9RemoveMap {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"Nikola");
        students.put(6,"Will");
        students.put(7,"Will");
        students.put(3,"Nikola");
        students.put(2,"Nikola");

        //var studentSet = students.entrySet();
        Set<Map.Entry<Integer,String>> studentSet = students.entrySet();
        studentSet.removeIf(x->x.getKey()>3&& x.getValue().contains("l"));
        System.out.println(studentSet);
    }
}
