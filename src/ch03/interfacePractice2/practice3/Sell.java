package ch03.interfacePractice2.practice3;

public interface Sell {
    void sell();

    default void order(){
        System.out.println("sell order");
    }
}
