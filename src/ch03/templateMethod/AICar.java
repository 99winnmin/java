package ch03.templateMethod;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AI drive");
        System.out.println("auto direction");
    }

    @Override
    public void stop() {
        System.out.println("auto stop");
    }
}
