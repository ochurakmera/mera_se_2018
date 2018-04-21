/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public class Book 
{
    private String title;
    private int yearIssued;
    private int pages;
    private Author author;
    
    public Book (String title, int yearIssued, int pages, Author author)
    {
        this.title = title;
        this.yearIssued = yearIssued;
        this.pages = pages;
        this.author = author;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the yearIssued
     */
    public int getYearIssued() {
        return yearIssued;
    }

    /**
     * @param yearIssued the yearIssued to set
     */
    public void setYearIssued(int yearIssued) {
        this.yearIssued = yearIssued;
    }

    /**
     * @return the pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
}
