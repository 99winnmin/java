package ch03.interfacePractice2.practice3.library;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }
}
