package class23;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("adverse");
        words.add("immutable");
        words.add("disgruntled");

        for(int i = 0; i <words.size(); i++){
          String myWords =  words.get(i);
          if(myWords.endsWith("e")){
              words.remove(i);
             i--;
          }
        }
        System.out.println(words);

    }
}
