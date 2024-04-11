package class16.practise;
/*
/* Write a java class that have 4 constructors with 4 different access levels of constructors
(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
 2 - from outside the class; 3 - from different class inside different package  and observe result
 */
public class Task {

    Task(String my){
        System.out.println(my);
    }
    public Task(int age){
        if(age>1 && age<80){
            System.out.println(age);
        }
        else {
            System.out.println(" wrong age");
        }
    }
    protected Task(double salary){
        System.out.println(salary);
    }
    private Task(String address, int phone){
        System.out.println(address+phone);

        }
        void printInfo(){
            System.out.println();
        }


    public static void main(String[] args) {
        Task task1 = new Task("Name");
        task1.printInfo();
        Task task2 = new Task(33);
        task2.printInfo();
        Task task3 = new Task(12234.78);
        task3.printInfo();
        Task task4 = new Task("Washington Dc ", 45);
        task4.printInfo();
    }
    }


