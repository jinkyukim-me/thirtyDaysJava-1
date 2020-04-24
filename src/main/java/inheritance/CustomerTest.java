package inheritance;

public class CustomerTest {

    public static void main(String[] args) {


        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//        customerkim.setCustomerName("김유신");
//        customerkim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        customerLee = customerKim;
    }


}
