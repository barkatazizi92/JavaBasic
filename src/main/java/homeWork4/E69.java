package homeWork4;
/*
Write a program that creates an array of strings with the following values{"This", "is", "array", "of",
 "strings"} and prints all values in one line.
**Output:**
This is array of strings
 */
public class E69 {
    public static void main(String[] args) {
        String [] words={"This", "is", "array", "of","string"};
        for(int i = 0; i< words.length; i++){
            System.out.print( words[i]+" ");
        }
    }
}
