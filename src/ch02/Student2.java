package ch02;

public class Student2 {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student2() {}
    public Student2(int studentNumber, String studentName, int grade){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }
    public String showStudentInfo(){
        return studentName+"'s ID is : "+studentNumber+"and grade : "+grade;
    }
}
