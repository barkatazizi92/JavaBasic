package barkatExercise2;

public class Break1 {
    public static void main(String[] args) {
        // create an array and enter these value inside. "Barkat","Milad","Kabul","Afghanistan"
        // and print the kabul for me,

        String[] names = {"Barkat", "Milad", "Kabul", "Afghanistan"};
        String nam = "Kabul";
        for (int i = 0; i < names.length; i++) {
            if (names.equals(nam)){
                System.out.println("Name is present");
            }
        }
    }
}

