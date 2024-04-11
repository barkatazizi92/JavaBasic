package class7.practice;

public class E2 {
    public static void main(String[] args) {

        String[] names = {"James", "barkat", "Ali", "Milad"};
        String name = "barkat";
        for (String n: names){
            if(n.equals(name)){
                System.out.println("Present");
            }
        }
    }
}
