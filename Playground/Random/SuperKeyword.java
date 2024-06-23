import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book {
    // Declare the price instance variable
    int price;

    /**
     * Class Constructor
     * 
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    // Write your constructor here
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     * 
     * Print the title, author, and price in the specified format.
     **/
    // Write your method here
    @Override
    void display() {
        System.out.println("Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Price: " + this.price);
    }

}
// End class

class MyUpdatedBook extends MyBook {
    int rating;

    MyUpdatedBook(String title, String author, int price, int rating) {
        super(title, author, price);
        this.rating = rating;
    }

    void calculateActualRating() {
        // access title, author, price
        String title = super.title;
        String author = super.author;
        int price = super.price;

        System.out.println(String.format("%s %s %d %d", title, author, price, rating));
    }

    @Override
    void display() {
        super.display();
        calculateActualRating();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = /* scanner.nextLine(); */ "Harry Potter";
        String author = /* scanner.nextLine(); */ "Rohan";
        int price = /* scanner.nextInt(); */ 500;
        scanner.close();

        Book book = new MyUpdatedBook(title, author, price, 5);
        book.display();
    }
}