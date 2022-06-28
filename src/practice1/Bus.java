package practice1;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){//승차
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber+"'s bus passenger is "+passengerCount+" money is "+money);
    }
}
