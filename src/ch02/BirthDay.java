package ch02;

public class BirthDay {
    //접근 제어자를 선언함으로써 객체를 사용함에 있어서 오류를 막을 수 있음!
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    //IntelliJ의 Alt+Insert키로 setter,getter 한번에 생성하기
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        //setter 메서드로 객체의 오남용을 막을 수 있음
        //잘못 사용될 확률을 줄여라!
        if(month <1 || month > 12){
            isValid=false;
            System.out.println("inValid num");
        }
        else{
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
