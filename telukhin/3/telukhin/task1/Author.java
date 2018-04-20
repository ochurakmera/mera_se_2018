package telukhin.task1;


import java.util.ArrayList;

public class Author extends Person {
    private ArrayList<Book> books = new ArrayList<>();

    public Author(String firstName, String lastName, int year, String country) {
        super(firstName, lastName, year, country);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books.add(book);
    }

    public int getAllPagesCountByAuthor() {
        int pageCount = 0;
        for (Book b : books) {
            pageCount += b.getPageCount();
        }
        return pageCount;
    }
}
