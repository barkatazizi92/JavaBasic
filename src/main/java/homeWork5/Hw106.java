package homeWork5;
/*
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.

**Expected Output**:

HELLO WORLD
 */
public class Hw106 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello ");
        stringBuffer.append("World");
       String buffer =  stringBuffer.toString().toUpperCase();
        System.out.println(buffer);



    }
}
