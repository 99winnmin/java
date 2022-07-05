package ch03.practice.practice1;

public class BeginnerLevel extends PlayerLevel{
    @Override
    protected void run() {
        System.out.println("slow");
    }

    @Override
    protected void jump() {
        System.out.println("no jump");
    }

    @Override
    protected void turn() {
        System.out.println("no turn");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("******* BeginnerLevel ********");
    }
}
