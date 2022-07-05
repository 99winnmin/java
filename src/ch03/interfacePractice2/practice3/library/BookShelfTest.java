package ch03.interfacePractice2.practice3.library;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("1");
        bookQueue.enQueue("2");
        bookQueue.enQueue("3");
        bookQueue.enQueue("4");
        bookQueue.enQueue("5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
    }
}
