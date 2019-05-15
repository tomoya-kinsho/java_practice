public class Book {
    private String title;
    private String author;
    private int price;

    void showBook() {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
