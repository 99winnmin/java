package ch03.polymorphism;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer customerT = new Customer(1,"A");
        Customer customerJ = new Customer(2,"B");
        Customer customerE = new GoldCustomer(3,"C");
        Customer customerW = new GoldCustomer(4,"D");
        Customer customerQ = new VIPCustomer(5,"E");

        customerArrayList.add(customerT);
        customerArrayList.add(customerJ);
        customerArrayList.add(customerE);
        customerArrayList.add(customerW);
        customerArrayList.add(customerQ);

        for (Customer c : customerArrayList){
            System.out.println(c.showCustomerInfo());
        }
        int price = 10000;
        for (Customer c : customerArrayList){
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName()+"'s cost : "+cost);
            System.out.println(c.getCustomerName()+"'s bonusPoint : "+c.bonusPoint);
        }
    }
}