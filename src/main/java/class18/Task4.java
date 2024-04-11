package class18;
/*
Create 1 class with a static method that has 3 overloaded forms. then call each overloaded
method with specific arguments and observe result.
 */
public class  Task4 {

   static void add(){
       System.out.println(2);
    }
    static void add(int a){
        System.out.println(a);

    }

    static void add(int a , int b){
        System.out.println(a+ b);
    }

    public static void main(String[] args) {
        Task4.add();
        Task4.add(4);
        Task4.add(23,34);
    }
}
