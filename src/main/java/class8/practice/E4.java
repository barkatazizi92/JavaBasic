package class8.practice;

/*
Create a 2D array (shorter way) in which first array will consist of 4 names
and second array will contain grades. Then your program should print name of the
Students that has A and B grade
 */
public class E4 {
    public static void main(String[] args) {
        int[] name = {10, 34, 45, 66, 87, 100};
        for (int i = 0; i < name.length; i=i+2) {
            System.out.println(name[i]);
        }
    }
}

