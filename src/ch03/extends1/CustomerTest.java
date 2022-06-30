package ch03.extends1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("ryu");
        customerLee.setCustomerID(9911216);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("kim");
        customerKim.setCustomerID(648944);
        customerKim.bonusPoint = 100000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
