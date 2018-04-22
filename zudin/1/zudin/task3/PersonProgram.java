package zudin.task3;

public class PersonProgram {

    public static void main(String[] args) {

        Author lukiynenko = new Author("Сергей", "Лукьяненко", "11.04.1968", "Россия");
        Author gogol = new Author("Николай", "Гоголь", "20.03.1809", "Российская Империя");
        Author bulgakov = new Author("Михаил", "Булгаков", "03.05.1891", "Российская Империя");

        lukiynenko.books[0] = new Book("\"Ночной дозор\"", 1998, lukiynenko, 381);
        lukiynenko.books[1] = new Book("\"Лабиринт oтражений\"", 1996, lukiynenko, 416);
        gogol.books[0] = new Book("\"Вий\"", 1835, gogol, 44);
        bulgakov.books[0] = new Book("\"Собачье Сердце\"", 1925, bulgakov, 120);
        bulgakov.books[1] = new Book("\"Морфий\"", 1926, bulgakov, 40);

        authorInfo(lukiynenko, gogol, bulgakov);

    }

    public static void authorInfo(Author... writers) {
        int numberOfPages = 0;

        for (Author writer : writers) {
            int numberOfPagesLocal = 0;
            System.out.println("Автор: " + writer.getFirstname() + " " + writer.getLastrname());
            System.out.println("Книги: ");

            for (int i = 0; i < writer.books.length; i++) {
                if (writer.books[i] == null)
                    break;
                System.out.println(writer.books[i].bookTitle + " ");
                numberOfPagesLocal = numberOfPagesLocal + writer.books[i].numberOfPages;
                numberOfPages = numberOfPages + writer.books[i].numberOfPages;
            }
            System.out.println("Общее кoличество страниц книг автора: " + numberOfPagesLocal);
            System.out.println();
        }
        System.out.println("Общее кoличество страниц книг всех авторов: " + numberOfPages);
        System.out.println();
    }
}
