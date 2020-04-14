package hiding;

public class MydateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();

//        date.day = 10;
//        date.month = 7;
//        date.year = 2020;

        date.setYear(2020);
        date.setMonth(40);
        date.setDay(140);

        date.showMyDate();
    }

}
