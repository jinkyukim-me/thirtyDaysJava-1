package array;

public class ObjectDeepCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("노인과 바다", "어니스트 헤밍웨이");
        library[1] = new Book("대지", "펄 벅");
        library[2] = new Book("작은 아씨들", "루이자 메이 올컷");
        library[3] = new Book("왕자와 거지", "마크 트웨인");
        library[4] = new Book("호밀밭의 파수꾼", "제롬 데이비드 샐린저");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }


        library[0].setTitle("자바의 정석");
        library[0].setAuthor("남궁성");

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("===========");

        for (Book book : copyLibrary) {
            book.showBookInfo();
        }


    }
}
