package interviewQuestion;

/*
count the number of words in a string. write a function to count the number of words in a given string.
words are separated by spaces or punctuation. for example, the input "Hello,Word!" should return2.
 */
public class E3InterviewQ {
     static int countWords(String str) {
        return str.split("[,.]").length;
    }

    public static void main(String[] args) {
        int count = countWords("Hello,Worlds");
        System.out.println(count);
    }
}