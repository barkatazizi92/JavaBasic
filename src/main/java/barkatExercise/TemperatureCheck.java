package barkatExercise;

public class TemperatureCheck {

    public static void main(String[] args) {
        int temperature = 31;
        if (temperature<32){
            System.out.println("Water will freeze with temperature " + temperature);
        }else {
            System.out.println("Water will  not freeze with temperature "+ temperature);
        }
    }
}
