package barkatExercise;

public class NestedIfTask3 {
    public static void main(String[] args) {
        int age = 23;
        double weightRequirements = 115;
        if (age>=18){

            if (weightRequirements>=110){
                System.out.println("He/She is eligible");
            }else
                System.out.println("We cannot accept such a patient");
        }
    }
}
