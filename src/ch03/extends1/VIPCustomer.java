package ch03.extends1;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer(){
        //super(); //없어도 default로 생성됨
        customerGrade = "VIP";
        bonusRatio =  0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer() call");
    }

    public int getAgentID(){
        return agentID;
    }
}
