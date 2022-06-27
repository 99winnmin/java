package ch01;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Day 2
        //단락 회로 평가 (short circuit evaluation) : && || 연산할 때 앞의 결과에 따라 뒷 연산은 안할 수도 있음
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        //삼항 연산자
        int max,x=1,y=2;
        max = (x > y)? x : y;
        //talse ? 이기 때문에 max = y; 실행됨
        System.out.println(max);

        num1 = 5;  	// 00000101
        int num2 = 10; 	// 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        //왼쪽으로 2비트 밀면 2의 2제곱을 곱한 것
        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);

        //java 14부터 가능한 switch case문법
        int month = 3;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10,12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4,6,9,11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 ->{
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default->{
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };
        System.out.println(month + "월은 " + day + "일입니다.");

        //do-while 예제, 일단 무조건 입력 받아야하는 상황이 있을 때 쓰면 좋음
        int input,sum=0;
        do {
            input = scanner.nextInt();
            sum += input;

        }while(input != 0);

        //중첩 반복문(nested loop) ex)구구단
        int dan = 2;
        int count = 1;

        for( dan = 2; dan <= 9; dan++) {

            for(count = 1; count <=9; count++) {

                System.out.println( dan + "X" + count + "=" + dan * count);
            }
            System.out.println();
        }

        dan = 2;
        while( dan <= 9 ) {
            count = 1;
            while (count <= 9) {

                System.out.println( dan + "X" + count + "=" + dan * count);
                count++;

            }
            dan++;
            System.out.println();
        }

    }
}
