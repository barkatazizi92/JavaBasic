package class11.practice;

public class Split {
// when we want to use split . we should create an array until we store the words inside
    public static void main(String[] args) {
        String goodBoy="You are so nice";
        String [] boy=goodBoy.split(" ");
        System.out.println(boy.length);
        System.out.println(boy[2]);
    }
}
