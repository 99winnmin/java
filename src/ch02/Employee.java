package ch02;

public class Employee {
    //기준이 되는 값이기 때문에 외부에서 변경하면 안됨
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        int i=0; //단순 지역 변수
//        employeeName = "Lee"; // static method안에서 인스턴스 변수 사용 불가, 아직 메모리가 잡히지 않았으므로
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
