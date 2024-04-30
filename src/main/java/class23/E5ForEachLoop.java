package class23;

import java.util.ArrayList;

public class E5ForEachLoop {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Barkat");
        names.add("Nikola");
        names.add("Asghar");
        names.add("john");
        names.forEach(x-> System.out.println(x));
        names.forEach(y-> System.out.println(y.length()));
    }
}
