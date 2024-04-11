package class12.TaskHomeWork;

public class E1Mehod {

    void sayHello (String country){
        switch (country){
            case "US":
                System.out.println("Hello");
                break;
            case"France":
                System.out.println("Bonjour");
                break;
            case"Egypt":
                System.out.println("Marhaba");
                break;
            case "Afghanistan":
                System.out.println("Salam");
                break;
            case"Spanish":
                System.out.println("Hola");
                break;
            default:
                System.out.println("country not found");
        }
        // I have to create the method first and then should call
    }

    public static void main(String[] args) {
        E1Mehod e1 = new E1Mehod();
        e1.sayHello("US");
        e1.sayHello("France");
        e1.sayHello("Egypt");
        e1.sayHello("Afghanistan");
        e1.sayHello("Spanish");
    }
}
