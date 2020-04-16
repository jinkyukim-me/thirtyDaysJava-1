package mission;

import java.util.Calendar;

public class MyDate {

    // day, month, year 변수는 private으로 선언
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;

    // MyDate(int day, int month, int year) 생성자를 만듦
    public MyDate (int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    // 각 변수의 getter, setter를 public으로 구현
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 0 || day > 31) {
                    isValid = false;
                }
                else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 0 || day > 30) {
                    isValid = false;
                }
                else {
                    this.day = day;
                }
                break;
            case 2:
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    if (day < 0 || day > 29) {
                        isValid =false;
                    }
                    else {
                        this.day = day;
                    }
                }
                else {
                    if (day < 0 || day > 28) {
                        isValid = false;
                    }
                    else {
                        this.day = day;
                    }
                }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ( month < 1 || month > 12) {
            isValid = false;
        }
        else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        }
        else {
            this.year = year;
        }
    }

    // public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인
    public String isValid() {

        if (isValid) {
            return "날짜가 유효합니다.";
        }
        else {
            return "날짜가 유효하지 않습니다.";
        }
    }
}
