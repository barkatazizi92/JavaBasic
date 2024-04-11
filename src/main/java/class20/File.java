package class20;
/*
Create a class File that will have the following behaviors: open, edit0, close and fields like name and size.
 Edit and close are implemented method while open is an abstract. Create 3 subclasses:
JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open java file we need notepad++ or sublime text, to open doc file we need Microsoft
word to be installed etc.Create a tester class and call all of the
methods from these classes.
 */
public abstract class File {

    private String name;
    private int size;

    File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void printInfo() {
        System.out.println(name + " " + size);
    }

    public abstract void open();

    public void edit() {
        System.out.println("we do not need edit");
    }

    public void close() {
        System.out.println("Do not close the");
    }
}

    class JavaFile extends File {


        JavaFile(String name, int size) {
            super(name, size);
        }

        public void open() {
            System.out.println(" to open java file we need notepad++ or sublime text");
        }

    }

    class WordFile extends File {
        WordFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("to open doc file we need Microsoft word to be installed etc.");
        }


    }

    class PdfFile extends File {
        PdfFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("For Pdf file we need acrobat");
        }

    }





/*
public abstract class File {
    private String name;
    private double size;

    File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();

    void edit() {
        System.out.println("Editing");
    }

    void close() {
        System.out.println("Application closed");
    }

    protected String printInfo() {
        return name;
    }
}

class JavaFile extends File {
    JavaFile(String name, double size) {
        super(name, size);
    }

    void open() {
        System.out.println("Opening " + printInfo() + " in notepad++");
    }
}

class WordFile extends File {
    WordFile(String name, double size) {
        super(name, size);
    }

    void open() {
        System.out.println("Opening " + printInfo() + " in Microsoft Word");
    }
}

class PdfFile extends File {
    PdfFile(String name, double size) {
        super(name, size);
    }

    void open() {
        System.out.println("Opening " + printInfo() + " in Adobe Acrobat");
    }
}

class FileTester {
    public static void main(String[] args) {
        File[] files = {new JavaFile("Animal.java", 34), new PdfFile("Divorce_Paper.pdf", 140), new WordFile("How To " +
                "Understand Women.doc", 1000000000)};
        for (File f : files) {
            f.open();
            f.edit();
            f.close();
        }
    }
}
 */

