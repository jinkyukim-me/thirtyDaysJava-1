package array;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("노인과 바다", "어니스트 헤밍웨이");
        library[1] = new Book("대지", "펄 벅");
        library[2] = new Book("작은 아씨들", "루이자 메이 올컷");
        library[3] = new Book("왕자와 거지", "마크 트웨인");
        library[4] = new Book("호밀밭의 파수꾼", "제롬 데이비드 샐린저");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
            System.out.println();
        }


    }
}
