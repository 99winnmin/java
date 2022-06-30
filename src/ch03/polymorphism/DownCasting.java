package ch03.polymorphism;

import java.util.ArrayList;

public class DownCasting {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        DownCasting test = new DownCasting();
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

        test.testDownCasting(animalList);
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list){
        for(int i=0 ; i<list.size() ; i++){
            Animal animal = list.get(i);

            if(animal instanceof Human){
                Human human = (Human)animal;
                human.readBook();
            }
            else if(animal instanceof Tiger){
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle){
                Eagle eagle = (Eagle)animal;
                eagle.fly();
            }
            else{
                System.out.println("unsupported");
            }
        }
    }
}