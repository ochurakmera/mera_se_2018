package zudin.task3;

public class Author extends Person {
    Book[] books = new Book[3];

    public Author(String firstName, String lastName, String dateOfBirth, String country) {
        super(firstName, lastName, dateOfBirth, country);

    }

}
