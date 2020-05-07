package object;

class Book {
    String title;
    String author;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + "," + title;
    }
}


public class ToStringTest {

    public static void main(String[] args) {

        Book book = new Book("토지","박경리");

        System.out.println(book);
        System.out.println(book.title);
        System.out.println(book.author);

        String str = new String("토지");
        System.out.println("=======");
        System.out.println(str);
        System.out.println(str.toString()); // 생략되어있음 Same

    }
}
