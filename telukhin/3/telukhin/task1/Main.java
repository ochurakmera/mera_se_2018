package telukhin.task1;

public class Main {
    public static void main(String[] args) {
        Author ivan = new Author("Иван", "Бунин", 1870, "Россия");
        Author fedor = new Author("Федор", "Достоевский", 1821, "Россия");
        Author lev = new Author("Лев", "Толстой", 1828, "Россия");

        ivan.setBooks(new Book("Темные аллеи", 2008, ivan, 416));
        ivan.setBooks(new Book("Митина Любовь", 2011, ivan, 352));

        fedor.setBooks(new Book("Идиот", 2016, fedor, 640));
        fedor.setBooks(new Book("Преступление и наказание", 2016, fedor, 672));

        lev.setBooks(new Book("Анна Каренина", 2017, lev, 864));
        lev.setBooks(new Book("Бегство из рая", 2017, lev, 640));

        getPagesByAuthor(ivan, fedor, lev);
        getAlPagesCount(ivan, fedor, lev);
    }

    private static void getAlPagesCount(Author... authors) {
        int allPagesCount = 0;
        for (Author a : authors) {
            allPagesCount += a.getAllPagesCountByAuthor();
        }
        System.out.println("Всего страниц написано " + allPagesCount);
    }

    private static void getPagesByAuthor(Author... a) {
        for (Author author : a) {
            System.out.println("Колличество страниц у " +
                    author.getFirstName() + " " +
                    author.getLastName() + " = " +
                    author.getAllPagesCountByAuthor());
        }
    }
}
