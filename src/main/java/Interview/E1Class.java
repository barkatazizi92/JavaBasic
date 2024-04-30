package Interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class E1Class {

    // How we can remove the duplicate from arrayList
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Hamid");
        name.add("John");
        name.add("Aziz");
        name.add("Hamid");
        name.add("Aziz");
        name.add("John");

        Set<String> removeDub = new LinkedHashSet<>(name);
        removeDub.forEach(x-> System.out.println(x));


    }
}
