package ch03.abstractClass;

//다 구현되었음에도 abstract 선언을 하는 것은 이 클래스가
//오직 상속만을 위한 클래스임을 의미함
public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
