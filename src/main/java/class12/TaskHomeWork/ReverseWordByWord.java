package class12.TaskHomeWork;
/*
how to reverse string word by word. fot example , input how are you.
output=  woh era uoy.
 */
public class ReverseWordByWord {
    public static void main(String[] args) {
        String sentence = "how are you";
       String [] word= sentence.split(" ");
       for(String con: word){
           StringBuilder builder = new StringBuilder(con);
           builder.reverse();
           System.out.print(builder+ " ");
       }
    }
}
