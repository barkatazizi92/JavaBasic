package class11.Tasks;
//Create a String and print it in reverse order(Barkat Azizi = izizA TakraB)
public class PracticeTaskTwo {

    public static void main(String[] args) {
        String myName="Barkat Azizi";
        for(int i =myName.length()-1; i>=0; i--){
            System.out.println(myName.charAt(i));
        }
    }
}
