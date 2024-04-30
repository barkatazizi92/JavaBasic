package homeWork6;
/*
Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Output:**

```
TEST
```
 */
public class Hw115 {

    public String acceptString(String a){
        return a;
    }

    public static void main(String[] args) {
        Hw115 hw115 = new Hw115();
     String n = hw115.acceptString("test");
        System.out.println(n.toUpperCase());
    }
}
