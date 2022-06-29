package dataStructure.arrayList;
import dataStructure.array.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //개수를 설정안하면 default로 10개로 함
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("book1","ryu"));
        library.add(new Book("book2","ryu"));
        library.add(new Book("book3","ryu"));
        library.add(new Book("book4","ryu"));
        library.add(new Book("book5","ryu"));

        for(int i=0 ; i<library.size() ; i++){
            library.get(i).showBookInfo();
        }
    }
}
