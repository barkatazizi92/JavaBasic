package homeWork5;
/*
create a String given="Hello Syntax friends". Using String methods from given String create
 new String "Welcome Syntax family"
Expected Output:
Welcome Syntax family
 */
public class Hw98 {
    public static void main(String[] args) {
        String given = "Hello syntax friends";
        String change = given.replace("Hello", "Welcome");
        String newString =  change.replace("friends","family");
        System.out.println(newString);



    }
}
