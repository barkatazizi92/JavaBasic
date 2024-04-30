package class24;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with "A";
 */
public class Task4 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Washington");
        cities.add("Virginia");
        cities.add("Bamiyan");
        cities.add("Maryland");
        cities.add("Miami");
        cities.add("California");
        cities.add("Atalanta");

        Set<String> citiesName = new LinkedHashSet<>(cities);
        System.out.println(citiesName);

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
/*
        List<String> city=new ArrayList<>();
        cities.add("Paris");
        cities.add("Casablanca");
        cities.add("Almeria");
        cities.add("Bamiyan");
        cities.add("Cairo");
        cities.add("Atlanta");

        Set<String> newList= new LinkedHashSet<>(city);
        System.out.println(newList);
        city.removeIf(x->x.startsWith("A"));
        System.out.println(city);

 */
    }
}
