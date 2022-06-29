package dataStructure.arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("ko", 100);
        studentLee.addSubject("math", 50);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("ko", 70);
        studentKim.addSubject("math", 85);
        studentKim.addSubject("eng", 100);

        studentLee.showStudentInfo();
        System.out.println("======================================");
        studentKim.showStudentInfo();
    }

}
