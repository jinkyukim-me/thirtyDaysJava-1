package mission3rd;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Book> bookList;
    int index;

    // constructor
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        bookList = new ArrayList<Book>();
    }

    // method
    public void addBook(String title, String author) {
        Book book = new Book();

        book.setAuthor(author);
        book.setBookName(title);
        bookList.add(book);

    }

    public void showStudentInfo() {
        System.out.println( studentName + " 학생이 읽은 책은 : ");

        for(Book book : bookList) {
            System.out.println(book.getBookName() + " ");
        }

        System.out.println("입니다");



    }

}
