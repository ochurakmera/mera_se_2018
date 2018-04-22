package zudin.task3;

public class Book {
    String bookTitle;
    int year;
    Author author;
    int numberOfPages;

    public Book(String bookTitle, int year, Author author, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.year = year;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

}
