package ch03.interfacePractice2.practice3;

public interface Buy {
    void buy();

    default void order(){
        System.out.println("buy order");
    }
}
