package ch02;

public class OrderInfo {
    public int orderNum;
    public int orderPhoneNum;
    public String address;
    public int date;
    public int orderTime;
    public int cost;
    public int menuNum;

    public OrderInfo(String address){
        this.address = address;
    }

    public String showOrderInfo(String name){
        return "orderNum : "+orderNum+"/ orderPhoneNum : "+orderPhoneNum+"/ name : "+name;
    }
}
