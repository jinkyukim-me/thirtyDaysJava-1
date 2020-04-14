package cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentKim = new Student("제이든", 5000);
        Student studentPark = new Student("다니엘", 10000);
        Student studentKang = new Student("강하니", 15000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway subwayGreen = new Subway(2);
        Subway subwayOrange = new Subway(3);

        Taxi taxi7777 = new Taxi(7777);
        Taxi taxi8888 = new Taxi(8888);

        studentKim.takeBus(bus100);
        studentPark.takeSubway(subwayGreen);
        studentKang.takeTaxi(taxi7777);


        studentKim.showInfo();
        studentPark.showInfo();
        studentKang.showInfo();


        bus100.showBusInfo();
        bus500.showBusInfo();

        subwayGreen.showSubwayInfo();
        subwayOrange.showSubwayInfo();

        taxi7777.showTaxiInfo();
        taxi8888.showTaxiInfo();
    }
}
