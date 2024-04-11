package class15;

public class CatTester {
    public static void main(String[] args) {
       /* cat.name="meew";
        cat.color="black";
        cat.age= 2; */
        Cat cat = new Cat("meew","Black",2 );
        cat.printInfo();

        Cat cat2 = new Cat("Mooo","white", 5);
        cat2.printInfo();
       /* cat2.name="MOO";
        cat2.color="While";
        cat2.age= 4;*/


        Cat cat3 = new Cat("toomy", "Brown", 56);
        cat3.printInfo();
        /*cat3.name="tommy";
        cat3.color= "gray";
        cat3.age= 5 */

    }
}


