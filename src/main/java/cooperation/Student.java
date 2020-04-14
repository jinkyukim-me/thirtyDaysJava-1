package cooperation;

public class Student {

    String studentName;
    int grade;
    int money;

    // constructor
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    // method
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}


