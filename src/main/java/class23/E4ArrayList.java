package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add("Barkat");
        names.add("Nikola");
        names.add("Asghar");
        names.add("john");
        for(int i = 0; i <names.size(); i++){
            System.out.println(names.get(i));
        }
        for(String n: names){
            System.out.println(n);
        }
    }
}
