package class16;
/*
Write a Teacher class that have instance variables name and address. Create a constructor that will
initialize those variables. Print name & address of given Teacher using displayInfo method.
 */
public class Teacher {

    String name;
    String address;

    public Teacher(String name, String address){
       this.name=name;
       this.address=address;
    }

    void displayInfo(){
        System.out.println(name+" "+ address);
    }

    public static void main(String[] args) {
        Teacher teach = new Teacher("Asghar", "On the moon");
        teach.displayInfo();
    }
}
