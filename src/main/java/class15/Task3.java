package class15;
/*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
 */
public class Task3 {
    private static String getVowels(String str){
       return str.replaceAll("[^aeiouAEIOU]","");

    }

    public static void main(String[] args) {
      String can =  getVowels("Jaghori");
        System.out.println(can);

    }
}
