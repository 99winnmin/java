package ch03.practice.practice1;

public class SuperLevel extends PlayerLevel{
    @Override
    protected void run() {
        System.out.println("run fast");
    }

    @Override
    protected void jump() {
        System.out.println("jump high");
    }

    @Override
    protected void turn() {
        System.out.println("turn");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("******* SuperLevel ********");
    }
}
