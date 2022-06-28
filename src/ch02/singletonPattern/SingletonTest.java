package ch02.singletonPattern;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        //s1 s2 모두 같은 주소값을 가짐,
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);

    }
}
