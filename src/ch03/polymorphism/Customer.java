package ch03.polymorphism;

public class Customer {
    protected int customerID;
    protected String customerName;
    //상속받는 class가 사용할 수 있도록 접근 제어자를 protected로 선언
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() call");
    }

    public Customer(int customerID, String customerName){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        this.customerID = customerID;
        this.customerName = customerName;
        System.out.println("Customer(int, String) call");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerID() {

        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName+"'s grade is "+customerGrade +
                " and, bonusPoint is "+bonusPoint;
    }
}
