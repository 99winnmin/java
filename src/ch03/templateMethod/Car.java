package ch03.templateMethod;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("startCar");
    }

    public void turnOff(){
        System.out.println("stopCar");
    }
    //중요한 시나리오는 final로 override 금지시키기
    //template method pattern
    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }
}
