package homeWork5;
/*
String “abracadabra alakazam”;
Print out the position of the first occurrence of "c".
Print out the position of the first occurrence of " ".
Print out the position of the first occurrence of the variable target1.
Print out the position of the first occurrence of the variable target2.
Expected Output:
4
11
6
-1
 */
public class Hw93 {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        int position1 = str.indexOf("c");
        int position2 = str.indexOf(" ");
        int position3 = str.indexOf(target1);
        int position4 = str.indexOf(target2);

        System.out.println(position1);
        System.out.println(position2);
        System.out.println(position3);
        System.out.println(position4);


    }
}
