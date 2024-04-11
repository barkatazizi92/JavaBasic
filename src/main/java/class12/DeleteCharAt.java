package class12;

public class DeleteCharAt {

    public static void main(String[] args) {
        StringBuilder st= new StringBuilder("How are you ");
        st.deleteCharAt(2);
        System.out.println(st);
    }
}
