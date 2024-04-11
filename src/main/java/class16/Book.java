package class16;
/*
Write Book class that will have 5 instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
Create print info method and call it.
 */

public class Book {

   private String writer;
   private String bookName;
   private double bookSize;
   private double pages;
   private double price;

    public Book(String write, String bookName,double bookSize,double pages, double price){
        this.bookName=bookName;
        this.writer=write;
        this.bookSize=bookSize;
        this.pages=pages;
        this.price=price;
    }

    public Book(String writer, String bookName, double pages, double price){
        this.bookName=bookName;
        this.writer=writer;
        this.pages=pages;
        this.price=price;
        }
        void printInfo(){
            System.out.println(bookName+" "+ bookSize+" "+writer+" "+pages+" "+price);
        }
    }

