package ch02;

public class StudentTest2 {
    public static void main(String[] args) {
        Student2 studentRyu = new Student2();
        System.out.println(studentRyu.showStudentInfo());

        Student2 studentKim = new Student2(991216, "kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
