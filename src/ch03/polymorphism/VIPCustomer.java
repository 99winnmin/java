package ch03.polymorphism;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    /*public VIPCustomer(){
        //super(); //없어도 default로 생성됨
        customerGrade = "VIP";
        bonusRatio =  0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        agentID = 1000;
        customerGrade = "VIP";
        bonusRatio =  0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer(int, String) call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+" agentID : "+agentID;
    }

    public int getAgentID(){
        return agentID;
    }
}
