package ch03.templateMethod;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("human drive");
        System.out.println("human handling");
    }

    @Override
    public void stop() {
        System.out.println("human stopping");
    }
}
