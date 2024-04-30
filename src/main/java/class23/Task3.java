package class23;

import java.util.ArrayList;

/*
create an arraylist of drinks call it. if any drink has letter
"a" or "e" replace the whole word with water.
 */
public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> drink = new ArrayList<>();
        drink.add("Sparkling Water");
        drink.add("Mango");
        drink.add("coffee");

        for (int i = 0; i<drink.size();i++){
           String myDrink = drink.get(i);
           if(myDrink.contains("a")|| myDrink.contains("e")){
               drink.set(i,"water");
           }
        }
        System.out.println(drink);
    }

}
