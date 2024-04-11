package class16;

public class BookTester {

    public static void main(String[] args) {
        Book book = new Book("Barkat", "Love", 21, 365,100);
        Book book1 = new Book("Barkat","Love La", 160,67);
        book1.printInfo();
        book.printInfo();
    }
}
