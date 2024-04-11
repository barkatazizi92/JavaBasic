package class15;
/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes with your project and accessible by class name
 */
public class Task2 {
   public static String reverseStr (String a){
       String str = "";
       for (int i =a.length()-1; i>=0; i --){
           str=str+a.charAt(i);

       }
        return str;
    }

    public static void main(String[] args) {
        String string = reverseStr("How are you");
        System.out.println(string);
    }
}


