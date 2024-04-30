package class23;

import java.util.ArrayList;
import java.util.Arrays;

public class E2ArrayList {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Barkat");
        name.add("Nikola");
        name.add("Asghar");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.remove("Nikola"));
        System.out.println(name);
        name.add("Hamid");
        System.out.println(name);
        System.out.println(name.remove(2));
        System.out.println(name);
        System.out.println(name.contains("Barkat"));
        System.out.println(name.get(0));
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("Barkat"));
        System.out.println(name.set(1,"John"));
        System.out.println(name);
        System.out.println(name.add("Asghar"));
        System.out.println(name);
    }
}
