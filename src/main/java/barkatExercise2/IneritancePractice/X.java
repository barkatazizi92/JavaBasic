package barkatExercise2.IneritancePractice;

public class X {

    int a ;
    String b;
        void print(int a , String b){
            System.out.println(a +" "+b);
        }
    }
    class Y extends X {

    }
    class Z extends Y{

    }

    class XTester{
        public static void main(String[] args) {
            Z z = new Z();
            z.print(23, "Carrot");
        }
    }

