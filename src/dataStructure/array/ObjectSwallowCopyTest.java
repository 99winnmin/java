package dataStructure.array;

public class ObjectSwallowCopyTest {
    public static void main(String[] args) {
        Book[] library  = new Book[5];
        Book[] temp = new Book[5];

        library[0] = new Book("a","k");
        library[1] = new Book("b","kk");
        library[2] = new Book("c","kkk");
        library[3] = new Book("d","kkkk");
        library[4] = new Book("e","kkkkk");

        //System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
        //객체 주소만 복사되는 얕은 복사
        System.arraycopy(library,0,temp,0,5);

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
