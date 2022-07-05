package ch04;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String toString(){
        return studentNum+","+studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student) obj;
            if(this.studentNum == std.studentNum)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    //공변 반환타입(covariant return type)을 이용해서 오버라이딩할 때 조상 메소드의 반환타입을
    //자손 클래스 타입으로 변경을 허용할 수도 있다.
    //swallow copy
    @Override
    public Student clone() throws CloneNotSupportedException {
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){
        }
        return (Student) obj; //downcasting
    }
}
