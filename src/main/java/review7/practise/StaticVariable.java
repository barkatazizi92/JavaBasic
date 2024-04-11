package review7.practise;

public class StaticVariable {

    static int number;
    static String name;

    public static void main(String[] args) {
        StaticVariable.name="Hamid";
        StaticVariable.number=2;
        System.out.println(name+" "+number);
    }
}
