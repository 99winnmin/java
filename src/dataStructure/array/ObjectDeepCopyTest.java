package dataStructure.array;

public class ObjectDeepCopyTest {
    public static void main(String[] args) {
        Book[] library  = new Book[5];
        Book[] temp = new Book[5];

        library[0] = new Book("a","k");
        library[1] = new Book("b","kk");
        library[2] = new Book("c","kkk");
        library[3] = new Book("d","kkkk");
        library[4] = new Book("e","kkkkk");

        temp[0] = new Book();
        temp[1] = new Book();
        temp[2] = new Book();
        temp[3] = new Book();
        temp[4] = new Book();

        for(int i=0 ; i< library.length ; i++){
            temp[i].setTitle(library[i].getTitle());
            temp[i].setAuthor(library[i].getAuthor());
        }

        library[0].setAuthor("ryuSeungMin");
        library[0].setTitle("java programming");

        for (Book book : library){
            System.out.println(book);
            book.showBookInfo();
        }
        System.out.println("\n============================\n");
        for (Book book : temp){
            System.out.println(book);
            book.showBookInfo();
        }
    }
}
