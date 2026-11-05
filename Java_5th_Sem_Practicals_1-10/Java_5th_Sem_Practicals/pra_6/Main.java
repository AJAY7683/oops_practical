class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Java Basics", "James", 450);
        Book copiedBook = new Book(parameterizedBook);

        System.out.println("Default constructor:");
        defaultBook.display();

        System.out.println("Parameterized constructor:");
        parameterizedBook.display();

        System.out.println("Copy constructor before modification:");
        copiedBook.display();

        copiedBook.price = 500;
        copiedBook.title = "Advanced Java";

        System.out.println("Original object after modifying copy:");
        parameterizedBook.display();

        System.out.println("Copied object after modification:");
        copiedBook.display();

        System.out.println("The original remains unchanged because the fields are copied.");
    }
}
