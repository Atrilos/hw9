package pro.sky;

public class App {

    public static void main(String[] args) {
        Author author1 = new Author("Bill", "Crumbs");
        Author author2 = new Author("Ann", "Sennz");
        Book book1 = new Book("Bruce", author1, 1967);
        Book book2 = new Book("Chick", author2, 2001);
        System.out.println(book1);
        book1.setPublicationYear(1800);
        System.out.println(book1);
        System.out.println(book2);
    }
}