package ch01;
//ctrl+alt+o 로 사용하지 않은 import 관리하기
import java.util.List;

public class Day1 {
    //psvm 치면 main method 자동 생성
    public static void main(String[] args){
        //sout 치면 System.out.println 자동 생성
        System.out.println("Hello, Java");

        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;
        System.out.println(num);
        System.out.println(bNum);//2진수
        System.out.println(oNum);//8진수
        System.out.println(xNum);//16진수

        long lnum = 12324567897987878L;//long 타입은 마지막에 L로 선언을 해줘야함
        float fnum = 3.14F;//실수는 기본적으로 8바이트로 잡히기 때문에 4바이트인 float할때 F 선언해주기

        double dnum = 1;
        for(int i=0 ; i<1000 ; i++){
            dnum += 0.1;
        }
        //부동 소수점 방식의 오류
        //지수와 가수로 나타내는 부동 소수점 방식에서는 지수부가 0을 표현할 수 없기 때문에
        //약간의 오차가 있을 수 있음
        System.out.println(dnum);

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((int)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        char han = '한';
        char hanCh = '\uD55c';
        System.out.println(han);
        System.out.println(hanCh);

        var i = 10;
        var j = 10.0;
        var str = "hello";
        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        //str = 3; 중간에 타입을 바꾸는 건 안됨

        final int MAX_NUM = 100;//다른 변수랑 차별화하기 위해 보통 대문자 사용
        final int MIN_NUM;//바로 초기화 안하는 경우도 있긴함 근데 바로 해주는게 좋음

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //MAX_NUM = 1000; 나중에 못바꿈

        byte bNum2 = 10;
        int iNum = bNum2;

        int iNum1 = 20;
        float fNum = iNum1;//작은 것이 큰 것에 들어가는 것은 상관 없음

        int iNum2 = 255;
        byte bNum3 = (byte)iNum2;//명시적 형 변환 필요 상황
        System.out.println(bNum3);
        double dNum2 = 3.14;
        int iNum3 = (int)dNum2;

        /*double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum; 1+0으로 연산됨
        int iNum2 = (int)(dNum + fNum); 1.2+0.9 = (int)2.1 = 2

        System.out.println(iNum1);
        System.out.println(iNum2);*/


    }
    //alt + enter로 에러 퀵픽스, F2키로 에러 이슈 있는 곳 찾아다니기
    List<String> list;
}
