package homeWork4;
/*
Using for loop Print 1 to 10 Numbers except 5 and 6
Output:
1
2
3
4
7
8
9
10
 */
public class E62 {
    public static void main(String[] args) {
        for(int i =1; i <10; i++){
            if(i==5 || i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
