package ch02;

public class StudentTest {
    public static void main(String[] args) {
        //Student라는 클래스를 기반으로 여러개의 instance를 만들 수 있다
        Student studentRyu = new Student();
        studentRyu.studentID = 20180304;
        studentRyu.setStudentName("Ryu");
        studentRyu.address = "seoul";

        studentRyu.showStudentInfo();
        //studentKim은 인스턴스의 참조변수임
        Student studentKim = new Student();
        studentKim.studentID = 201803041;
        studentKim.setStudentName("Kim");
        studentKim.address = "seoul-gangnam";

        studentKim.showStudentInfo();
        //JVM이 준 가상 메모리 주소 출력
        System.out.println(studentKim);
        System.out.println(studentRyu);
    }
}
