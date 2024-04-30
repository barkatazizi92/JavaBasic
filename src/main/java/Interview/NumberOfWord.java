package Interview;

/*
Count the Number of Words in a String: Write a function to count the
 number of words in a given string. Words are separated by spaces or
 punctuation. For example, the input "Hello, world!" should return 2.
 */

public class NumberOfWord {
    String words = "Hello,Word";
    String [] w = words.split(",");


    public static void main(String[] args) {
        NumberOfWord numberOfWord = new NumberOfWord();
        System.out.println(numberOfWord.w.length);
    }
}
class ThirdWay{
   public static void towWords(String a){
      String [] wordA =  a.split(" ");
       System.out.println(wordA.length);
    }

    public static void main(String[] args) {
        towWords("How are you my friend");

    }
}
