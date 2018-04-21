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
public class ClassesExcersize 
{
    public static void main(String [] args)
    {
        Author dummyAuthor = new Author();
        int pagesByAuthor;
        int totalPages = 0;
        
        Author [] authors = 
        {
            new Author("Иван","Иванов",1975,"Россия", 
                new Book("Теория сигналов.", 2005, 300, dummyAuthor),
                new Book("Автоматика.", 2008, 400, dummyAuthor)),
            new Author("Пётр","Петров",1970,"Беларусь",
                new Book("Освобождение Витебска.", 2000, 500, dummyAuthor)),
            new Author("John", "Jones", 1976,"United Kingdom",
                new Book("Algotithm logic overview.", 2011, 50, dummyAuthor),
                new Book("Big bang theory: software designer view.", 2015, 500,dummyAuthor))
        };
        
        for (Author a:authors)
        {
            pagesByAuthor = 0;
            
            for(Book b:a.getWrittenBooks())
            {
                pagesByAuthor += b.getPages();
            }
            
            totalPages += pagesByAuthor;
            System.out.println("Pages by author \"" 
                    + a.getFirstame() 
                    + " " 
                    + a.getLastName()
                    + "\": "
                    + pagesByAuthor);
        }
        
        System.out.println("Total pages: " + totalPages);
        System.out.println("Total objects of class \"Person\": " + Person.getPersonCount());
    }
}
