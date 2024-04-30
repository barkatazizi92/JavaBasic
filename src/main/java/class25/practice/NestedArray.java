package class25.practice;

import java.util.ArrayList;

public class NestedArray {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Hadi");
        names.add("Jan");
        names.add("Barkat");

        ArrayList<String> name2= new ArrayList<>();
        name2.add("Milad");
        name2.add("Latifa");
        name2.add("Gull");

        list.add(names);
        list.add(name2);
        System.out.println(list);
    }
}
