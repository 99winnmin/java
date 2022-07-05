package ch03.interfacePractice2;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("basic operation");
        myMethod();
        myStaticMethod();
    }

    static int total(int[] arr){
        int total = 0;
        for(int num : arr){
            total += num;
        }
        //myMethod(); -> static 메서드 안에서는 인스턴스 변수,메서드 사용불가
        myStaticMethod();
        return total;
    }

    private void myMethod(){
        System.out.println("myMethod");
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }
}
