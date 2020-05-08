package mission10;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate std = (MyDate)obj;
            if (this.day == std.day)
                return true;
            else return false;
        }
        return false;
    }
}

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(10,12,2020);
        MyDate date2 = new MyDate(10,12,2020);

        System.out.println(date1.equals(date2));
    }
}
