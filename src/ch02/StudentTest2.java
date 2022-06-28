package ch02;

public class StudentTest2 {
    public static void main(String[] args) {
        Student3 studentRyu = new Student3(100,"lee");
        studentRyu.setKoreaSubject("korea",100);
        studentRyu.setMathSubject("math",90);

        Student3 studentKim = new Student3(95, "ryu");
        studentKim.setKoreaSubject("korea",70);
        studentKim.setMathSubject("math",100);

//        OrderInfo order1 = new OrderInfo("seoul");
//        System.out.println(order1.showOrderInfo(studentKim.studentName));
        studentRyu.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
