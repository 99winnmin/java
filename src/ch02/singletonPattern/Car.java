package ch02.singletonPattern;

public class Car {
    private int carNum;

    public Car(int carNum){
        this.carNum = carNum;
    }

    public int getCarNum(){
        return this.carNum;
    }
}
