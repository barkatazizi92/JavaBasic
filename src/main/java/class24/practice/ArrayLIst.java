package class24.practice;

import java.util.ArrayList;
import java.util.List;
/*
List:
    1) Insertion order is maintained.
    2) Duplicates are allowed.

ArrayList:
    UpSide: Very Fast when accessing the elements.
    Downside: Really slow when we have to add or remove data from the ArrayList
 */
public class ArrayLIst {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        List<String> book = new ArrayList<>();
        book.add("History book");
        book.add("chemistry book");
        book.add("Math book");
        book.add("Biology book");
        System.out.println(book);


       book.set(1,"English book");
        System.out.println(book);

      book.set(2,"Physic book");
      System.out.println(book);
      book.add(1,"geology book");
      System.out.println(book);
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
