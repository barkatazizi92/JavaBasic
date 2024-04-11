package class16;
/* Write a java class that have 4 constructors with 4 different access levels of constructors
(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
 2 - from outside the class; 3 - from different class inside different package  and observe result
 */
public class Task3 {
    String name;
   private Task3(){
    }
    protected Task3(String eName){
       name=eName;
    }
    public Task3(String name, int age){
    }
    Task3(String name, int age, int salary){
    }
    void print1(){
        System.out.println("First constructor which has private access modifier");
    }
    void print2(){
        System.out.println("Second constructor which has protected access modifier"+name);
    }

    void print3(){
        System.out.println("third constructor which has public access modifier");
    }
    void print4(){
        System.out.println("forth constructor which has default access modifier");
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.print1();
        task3.print2();
        task3.print3();
        task3.print4();
    }
    }

