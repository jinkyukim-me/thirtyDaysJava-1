package array;

public class Book {

    private String title;
    private String author;

    // 생성자 2개

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter, setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    // 메서드

    public void showBookInfo() {
        System.out.println(title + "," + author);
    }
}
