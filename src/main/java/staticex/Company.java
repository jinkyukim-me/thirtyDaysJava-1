package staticex;

public class Company {

    private static Company instance = new Company();

    private Company() {}

    public static Company getInstance() { // 외부에서 참조할 수 있게 static를 사용

        if ( instance == null ) {
            instance = new Company();
        }
        return instance;
    }
}
