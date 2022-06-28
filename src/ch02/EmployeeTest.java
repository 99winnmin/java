package ch02;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("ryu");
//        System.out.println(employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("kim");
//        employeeKim.serialNum++;

//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);
        System.out.println(employeeLee.getEmployeeName()+" , "+employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+" , "+employeeKim.getEmployeeId());

        //다음과 같이 인스턴스를 생성하지 않아서 사용할 수 있음 but private이라면 불가능, getter를 이용해야함
//        System.out.println(Employee.serialNum);
        System.out.println(Employee.getSerialNum());
    }
}
