package ch03.extends2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1,"first");
//        customerLee.setCustomerName("ryu");
//        customerLee.setCustomerID(9911216);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(2,"second");
//        customerKim.setCustomerName("kim");
//        customerKim.setCustomerID(648944);
        customerKim.bonusPoint = 100000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer(3,"third");
        //vc.getAgentID(); ->ERROR
        //VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만,
        //변수의 타입이 Customer 이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드임
        System.out.println(vc.showCustomerInfo());
    }
}