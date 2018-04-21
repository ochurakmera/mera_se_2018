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
public class Author extends Person
{
    private Book [] writtenBooks;
    
    public Author()
    {
        super();
    }
    
    public Author(String firstName, String lastName, int birthYear, String country, Book ... writtenBooks)
    {
        super(firstName,lastName,birthYear,country);
        this.writtenBooks = writtenBooks;
    }
    
    public Author(Person person, Book ... writtenBooks)
    {
        super(person);
        this.writtenBooks = writtenBooks;
    }

    /**
     * @return the writtenBooks
     */
    public Book[] getWrittenBooks() {
        return writtenBooks;
    }
   
    /**
     * @param writtenBooks: each book is to be provided as an argument
     */
    public void setWrittenBooks(Book ... writtenBooks)
    {
        this.writtenBooks = writtenBooks;
        for(Book b:writtenBooks)
        {
            b.setAuthor(this);
        }
    }
}
