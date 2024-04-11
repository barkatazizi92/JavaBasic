package class15;

public class Cat {

    private String name;
    private String color;
    private int age;

    Cat(String cName, String cColor, int aAge){
        name=cName;
        color=cColor;
        age=aAge;
    }


    void printInfo(){
       System.out.println(name+ " "+color+ " "+age);
    }
}
