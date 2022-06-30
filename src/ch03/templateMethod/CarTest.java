package ch03.templateMethod;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car hCar = new ManualCar();
        hCar.run();
    }
}
