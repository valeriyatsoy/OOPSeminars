package book;

public class Main {
    public static void main(String[] args) {
        Book someBook = new Book();
        someBook.name = "Harry Potter and the Prisoner of Azkaban";
        someBook.price = 10.55;
        someBook.author = "J.K.Rowling";

        someBook.displayInfo();
    }
}