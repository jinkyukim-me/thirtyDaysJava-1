package thisex;

public class PersonTest {

    public static void main(String[] args) {

        Person personNoname = new Person();
        personNoname.showInfo();

        Person personKim = new Person("김자바", 20);
        personKim.showInfo();
        System.out.println(personKim);

        Person p = personKim.getSelf();

        System.out.println(p);
    }
}
