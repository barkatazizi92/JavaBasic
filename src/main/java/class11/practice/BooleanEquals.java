package class11.practice;

public class BooleanEquals {
    public static void main(String[] args) {
        /* this method compares this string to another string. if the first string
         and the second string are having the same sequence of characters , the method
         return true result . otherwise return the false result
         */
        String str = new String ("I love java even it is hard");
        String str2= "This is the only way i can help my family by leaning java";
        String str3="I love java even it is hard";
        boolean work= str.equals(str2);
        boolean hard= str3.equals(str);
        System.out.println(hard);
        System.out.println(str.equals(str2)+" direct");
        System.out.println(str.equals(str3)+" direct");
        System.out.println(work);
    }
}
