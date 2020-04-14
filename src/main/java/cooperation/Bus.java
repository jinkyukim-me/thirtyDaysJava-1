package cooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    // constructor
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 버스를 타는 메소드
    public void take(int money) { //승차
        this.money += money;
        passengerCount++;
    }

    // method
    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다");
    }
}
