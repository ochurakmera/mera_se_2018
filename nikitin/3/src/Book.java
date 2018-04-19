package src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String title;
    private Date date;
    private Autor autor;
    private int pages;
    private static int totalPages = 0;

    public Book(String title, Date date, Autor autor, int pages) {
        this.title = title;
        this.date  = date;
        this.autor = autor;
        this.pages = pages;
        totalPages+=pages;
    }

    public void printBookInfo() {
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(String.format("\tTitle: %s Date: %s Autor: %s %s Pages: %d",
                this.title,
                sdf.format(this.date),
                this.autor.getFirstName(),
                this.autor.getSecondName(),
                this.pages));
    }


    public String getTitle() {
        return title;
    }

    public static void printTotalPages() {
        System.out.println("Total pages: " + totalPages);
    }

    public static void delete(Book book) {
        totalPages -= book.pages;
    }
}
