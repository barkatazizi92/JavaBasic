package class11;

public class E5String {
    public static void main(String[] args) {
        String st="Matt like WaterMelon. He is again in the kitchen";
        System.out.println(st.contains("s"));
        System.out.println(st.contains("Barkat like WaterMelon"));
        System.out.println(st.toLowerCase().contains("matt like watermelon"));
        System.out.println(st.startsWith("att"));
        System.out.println(st.startsWith("like"));
        System.out.println(st.startsWith("matt"));
        System.out.println(st.toLowerCase().startsWith("matt"));
        System.out.println(st.isEmpty());
        System.out.println(st.length());
        System.out.println(st.endsWith("kitchen"));


    }
}

