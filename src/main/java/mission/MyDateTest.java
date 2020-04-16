package mission;

// MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인
public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(29, 2, 2000);
        System.out.println(date1.isValid());

        MyDate date2 = new MyDate(22,10,2006);
        System.out.println(date2.isValid());
    }
}
