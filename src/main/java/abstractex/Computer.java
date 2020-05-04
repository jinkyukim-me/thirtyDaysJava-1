package abstractex;

public abstract class Computer {

    // method
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    public abstract void display();

    public abstract void typing();


}
