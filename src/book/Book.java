package book;

public class Book extends Product{
    String author;

    @Override
    public void displayInfo(){
        super.displayInfo(); //this will display name and price
        System.out.println("Book author: " + author);
    }
}
