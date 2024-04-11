package class17.practise;
/*
Create a method that will take 2 parameters as numbers and prints which number is larger
 */
public class E1 {

    public static void largerNumber(int a , int b){
        if(a>b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b+ " is greater than "+ a);
        }
    }
    public static void main(String[] args) {
        E1.largerNumber(45,67);
        // how are you
    }

}
