package ch02.singletonPattern;

public class CarFactory {
    private static int serialCarNum = 10000;
    private static CarFactory instance = new CarFactory();

    private CarFactory(){}

    public static CarFactory getInstance(){
        if(instance==null){
            instance  = new CarFactory();
        }
        return instance;
    }

    public int getSerialCarNum(){
        return serialCarNum;
    }
    public Car createCar(){
        serialCarNum++;
        Car newCar = new Car(serialCarNum);
        return newCar;
    }
}
