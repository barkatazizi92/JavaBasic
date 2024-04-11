package homeWork5;
/*
Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
Create String str2= SYNTAX TECHNOLOGIES and convert into syntax technologies
Output:
SYNTAX TECHNOLOGIES
syntax technologies
 */
public class Hw91 {
    public static void main(String[] args) {
        String str1 = "syntax technologies";
        String str2 = "SYNTAX TECHNOLOGIES";
        String syn = str1.toUpperCase();
        String syntax = str2.toLowerCase();
        System.out.println(str1 + " -covert from lower case to upper case- " +syn);
        System.out.println(str2+ " -covert from upper case to lower case- " + syntax);
    }
}
