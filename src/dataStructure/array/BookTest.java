package dataStructure.array;

public class BookTest {
    public static void main(String[] args) {
        Book[] library  = new Book[5];

        for(int i=0 ; i<library.length ; i++){
            System.out.println(library[i]);
        }//객체 배열의 요소는 null로 초기화됨

        library[0] = new Book("a","k");
        library[1] = new Book("b","kk");
        library[2] = new Book("c","kkk");
        library[3] = new Book("d","kkkk");
        library[4] = new Book("e","kkkkk");

        for (Book book : library){
            System.out.println(book);
            book.showBookInfo();
        }
    }
}
