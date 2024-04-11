package class12.TaskHomeWork;
/*
how would you swap 2 String without a temporary variable.
swap the value of first name to last name and last name to first name.
 */
public class SwapTwoVariable {
    public static void main(String[] args) {
        String firstName = "School";
        String lastName = "High school";
        System.out.println("first name = "+ firstName);
        System.out.println("Last name = " + lastName);

        // now we swap the two String.
       String box="";
       box= firstName; // moved the value of first name into the box and first name is empty.
        firstName=lastName;// moved the value of lastname into the first name.
        lastName=box;// we had the value of first name inside the box and not we move inside lastname.

        System.out.println("Name = " +firstName);
        System.out.println("Last Name = "+lastName);
    }
}
