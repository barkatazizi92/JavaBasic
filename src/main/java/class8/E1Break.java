package class8;

public class E1Break {

    public static void main(String[] args) {

        String [] names = {"James", "Iram", "Matt Naughty", "ubaidur","Aladin", "Ana", "Silvia"};
        // search for the name Iram if it is present print on the console name is present.
        String name= "ubaidur";// we should create data  type and variable and then
        // store the name we want to pick up from our elements.

        for(String herName:names){// we use enhance loops

            if (herName.equals(name)){// we if the variable is equal to our name . print
                System.out.println(name+" is present");
                break;
            }
        }
    }
}
