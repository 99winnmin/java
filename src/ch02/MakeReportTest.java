package ch02;

public class MakeReportTest {
    public static void main(String[] args) {
        //client딴에서는 getReport()메서드만 이용가능
        //나머지 메서드들은 모두 캡슐화함으로써 객체 오용을 막고
        //디버깅도 편리하게 하고 오류를 최소화할 수 있음
        MakeReport report = new MakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}
