package class20;

public class FileTester {
    public static void main(String[] args) {
        File [] file ={new JavaFile("computer",5),
                new WordFile("Laptop",6), new PdfFile("Desk top", 8)};
        for (int i = 0; i<file.length; i++){
          File a =  file[i];
          a.edit();
          a.close();
          a.open();
        }
    }
}
