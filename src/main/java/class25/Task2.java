package class25;

import java.util.*;

/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
 Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("US ", " Washington Dc");
        countries.put("Pakistan ", " Islamabad");
        countries.put("UAE ", " Dubai");
        countries.put("Tajikistan ", " Dushanbe");
        countries.put("Afghanistan ", " Kabul");

//   short way to call key and value
        countries.forEach((c, a)-> System.out.println(c+" "+a));

        System.out.println();

//  second way to call key and value by using var
       var country = countries.entrySet();
       country.forEach(x-> System.out.println(x));

        System.out.println();

//  third way to extract the key and value
      Set<Map.Entry<String,String>> bestCountries = countries.entrySet();
        country.forEach(x-> System.out.println(x));






    }
}
