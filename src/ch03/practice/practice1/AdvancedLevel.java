package ch03.practice.practice1;

public class AdvancedLevel extends PlayerLevel{
    @Override
    protected void run() {
        System.out.println("run");
    }

    @Override
    protected void jump() {
        System.out.println("jump");
    }

    @Override
    protected void turn() {
        System.out.println("no turn");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("******* AdvancedLevel ********");
    }
}
