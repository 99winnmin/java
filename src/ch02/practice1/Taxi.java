package ch02.practice1;

public class Taxi {
    String taxiCompany;
    int money;

    public Taxi(String taxiCompany){
        this.taxiCompany = taxiCompany;
    }
    public void take(int money){
        this.money += money;
    }

    public void showTaxiInfo(){
        System.out.println(taxiCompany+"'s money is "+money);
    }
}
