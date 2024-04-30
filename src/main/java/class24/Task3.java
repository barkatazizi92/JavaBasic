package class24;

import java.util.Set;
import java.util.TreeSet;

/*
create a Set in which you need to add names of the counties (5). in this set we want all object to be stored
in alphabetical order. retrieve all elements from set.
 */
public class Task3 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Afghanistan");
        countries.add("USA");
        countries.add("Paris");
        countries.add("India");
        System.out.println(countries);
    }
}
