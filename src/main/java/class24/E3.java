package class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E3 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        LinkedList<String> names= new LinkedList<>();
        for (int i =0; i<100000; i++){
            names.add(0,"Nikola");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
