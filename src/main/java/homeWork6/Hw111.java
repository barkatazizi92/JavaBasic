package homeWork6;
/*
Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
Call both methods

**Output:**

```
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class Hw111 {
    public void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }

    public String syntaxStudents(){
        return "Welcome Syntax Students!";
    }

    public void printInfo(){
        syntaxTechnologies();
       String students =  syntaxStudents();
        System.out.println(students);
    }

    public static void main(String[] args) {
        Hw111 hw111 = new Hw111();
        hw111.printInfo();
    }

}
