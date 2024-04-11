package class11.practice;

public class ConcatenationMethod {
    public static void main(String[] args) {
        //concatenation method appended one string to the end of another.

        String s ="Strings are immutable";
        s=s+(" all the time");
        System.out.println(s);
        String good="Good morning";
        good=good.concat(" thank you sir");
        System.out.println(good);
    }
}
