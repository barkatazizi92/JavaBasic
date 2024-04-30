package homeWork5;
/*
Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
Call both methods

**Output:**
```
newLine method implementation
displayLine method implementati
 */
public class Hw110 {

    public static void newLine(){
        System.out.println("newLine method implementation");
    }

    public static void displayLine(){
        System.out.println("displayLine method implementation");
    }
   public static void printInformation(){
        newLine();
        displayLine();
   }

    public static void main(String[] args) {
        Hw110.printInformation();
    }
}
