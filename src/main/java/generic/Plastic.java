package generic;

public class Plastic extends Material {

    public String toString() {
        return "재료는 Power 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic으로 프린팅 합니다.");
    }
}
