package ch02;

public class Student {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentID + "'s name : " + studentName + " and address : " + address);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
