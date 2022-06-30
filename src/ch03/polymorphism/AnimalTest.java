package ch03.polymorphism;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("moving");
    }

    public void eating(){}
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("human moving");
    }

    public void readBook(){
        System.out.println("reading");
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("tiger moving");
    }

    public void hunting(){
        System.out.println("tiger hunting");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("fly fly");
    }

    public void fly(){
        System.out.println("ealge flying");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        //같은 함수를 실행하는 것 같지만 implementation이 다름 -> polymorphism
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal a : animalList){
            a.move();
        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
