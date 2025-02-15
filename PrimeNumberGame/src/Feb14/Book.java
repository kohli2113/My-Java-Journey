package PrimeNumberGame.src.Feb14;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean flag;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = Book.this.title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = Book.this.author;
    }

    public String getAuthor() {
        return author;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }

    public Book(int id, String title, String author, boolean flag) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.flag = flag;
    }

}
