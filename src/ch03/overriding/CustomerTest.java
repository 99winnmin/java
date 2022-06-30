package ch03.overriding;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1,"first");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo()+" , "+price);

        VIPCustomer customerKim = new VIPCustomer(2,"second");
        customerKim.bonusPoint = 100000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo()+" , "+price);

        Customer vc = new VIPCustomer(12345,"TEST");
        vc.calcPrice(1000);
        System.out.println(price);
    }
}