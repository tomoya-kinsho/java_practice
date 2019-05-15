public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("aaaa", "tomoya", 100);
        Book book2 = new Book("bbb", "tomoya", 333);

        Book[] array = new Book[] { book1, book2 };
        for (Book book : array) {
            book.showBook();
        }
    }
}
