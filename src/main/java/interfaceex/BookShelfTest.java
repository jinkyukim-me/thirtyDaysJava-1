package interfaceex;

public class BookShelfTest {

    public static void main(String[] args) {

        // 기능적인 것을 우선한다면 인터페이스 타입으로 선언을 한다
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

    }
}
