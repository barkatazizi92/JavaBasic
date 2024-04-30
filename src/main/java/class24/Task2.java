package class24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("john");
        aList.add("jane");
        aList.add("James");
        aList.add("jasmine");
        aList.add("jane");
        aList.add("james");

        Set<String> oneList = new HashSet<>(aList);
        System.out.println(oneList);


    }
}
