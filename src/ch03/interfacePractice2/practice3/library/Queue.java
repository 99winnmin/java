package ch03.interfacePractice2.practice3.library;

public interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}
