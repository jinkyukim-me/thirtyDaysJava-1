package mission2nd;

public class CoffeTest {

    public static void main(String[] args) {

        Person kim = new Person("김졸려", 10000);
        Person lee = new Person("이피곤", 10000);

        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
        lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
    }
}
