package class17;

public class E {
    static void printF(){
        System.out.println("Hi");
    }
}

class F extends E{
    public static void main(String[] args) {
        E.printF();
    }
}
